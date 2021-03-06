package com.mycompany.mapita.modelo;
// Generated 12/02/2019 02:37:32 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private int idusuario;
     private String nombre;
     private String correo;
     private String contrasenia;
     private Date fechanacimiento;

    public Usuario() {
    }

	
    public Usuario(int idusuario, String nombre, String correo, String contrasenia) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasenia = contrasenia;
    }
    public Usuario(int idusuario, String nombre, String correo, String contrasenia, Date fechanacimiento) {
       this.idusuario = idusuario;
       this.nombre = nombre;
       this.correo = correo;
       this.contrasenia = contrasenia;
       this.fechanacimiento = fechanacimiento;
    }
   
    public int getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getContrasenia() {
        return this.contrasenia;
    }
    
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    public Date getFechanacimiento() {
        return this.fechanacimiento;
    }
    
    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }




}


