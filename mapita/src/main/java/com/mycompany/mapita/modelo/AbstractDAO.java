/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mapita.modelo;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author n-droid
 */
public class AbstractDAO<T> {
    
    protected SessionFactory sessionFactory;
    
    protected AbstractDAO(){
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }
    
    protected void save (T obj){
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            session.save(obj);
            tx.commit();

        }
        catch(HibernateException e){
            if(tx!=null)
                tx.rollback();
            e.printStackTrace();
        }
        finally{
            session.close();
        }
    }
    
    protected void update (T obj){}
    
    protected void delete (T obj){}
    
    protected T find (Class clazz, int id){
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        T obj = null;
        try{
            tx=session.beginTransaction();
            obj = (T)session.get(clazz, id);
            tx.commit();
        }
        catch(HibernateException e){
            if(tx!=null)
                tx.rollback();
        }
        finally{
            session.close();
        }
        return obj;
    }
    
    protected List findAll(Class clazz){
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        List<T> ls = null;
        try{
            tx=session.beginTransaction();
            String hlq = "From "+clazz;
            Query query = session.createQuery(hlq);
            ls = (List<T>)query.list();
            tx.commit();
        }
        catch(HibernateException e){
            if(tx!=null)
                tx.rollback();
        }
        finally{
            session.close();
        }
        return ls;
    }
}
