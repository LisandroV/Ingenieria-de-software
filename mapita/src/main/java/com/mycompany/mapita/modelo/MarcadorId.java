package com.mycompany.mapita.modelo;
// Generated 8/02/2019 02:10:16 PM by Hibernate Tools 4.3.1



/**
 * MarcadorId generated by hbm2java
 */
public class MarcadorId  implements java.io.Serializable {


     private int idmarcador;
     private String descripcion;
     private double longitud;
     private double latitud;
     private int usuarioid;

    public MarcadorId() {
    }

    public MarcadorId(int idmarcador, String descripcion, double longitud, double latitud, int usuarioid) {
       this.idmarcador = idmarcador;
       this.descripcion = descripcion;
       this.longitud = longitud;
       this.latitud = latitud;
       this.usuarioid = usuarioid;
    }
   
    public int getIdmarcador() {
        return this.idmarcador;
    }
    
    public void setIdmarcador(int idmarcador) {
        this.idmarcador = idmarcador;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getLongitud() {
        return this.longitud;
    }
    
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    public double getLatitud() {
        return this.latitud;
    }
    
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
    public int getUsuarioid() {
        return this.usuarioid;
    }
    
    public void setUsuarioid(int usuarioid) {
        this.usuarioid = usuarioid;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MarcadorId) ) return false;
		 MarcadorId castOther = ( MarcadorId ) other; 
         
		 return (this.getIdmarcador()==castOther.getIdmarcador())
 && ( (this.getDescripcion()==castOther.getDescripcion()) || ( this.getDescripcion()!=null && castOther.getDescripcion()!=null && this.getDescripcion().equals(castOther.getDescripcion()) ) )
 && (this.getLongitud()==castOther.getLongitud())
 && (this.getLatitud()==castOther.getLatitud())
 && (this.getUsuarioid()==castOther.getUsuarioid());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdmarcador();
         result = 37 * result + ( getDescripcion() == null ? 0 : this.getDescripcion().hashCode() );
         result = 37 * result + (int) this.getLongitud();
         result = 37 * result + (int) this.getLatitud();
         result = 37 * result + this.getUsuarioid();
         return result;
   }   


}


