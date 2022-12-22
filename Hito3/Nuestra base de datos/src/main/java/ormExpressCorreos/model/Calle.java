package ormExpressCorreos.model;

import javax.persistence.*;

 @Entity
 @Table
public class Calle {

     @Id
     @Column (nullable = false,unique = true)
     private String Ncalle;

     @ManyToOne
     @JoinColumn(name = "Municipio")
     private Municipio municipio;

     public Calle(String ncalle, Municipio municipio) {
         Ncalle = ncalle;
         this.municipio = municipio;
     }

     public String getNcalle() {
         return Ncalle;
     }

     public Municipio getMunicipio() {
         return municipio;
     }
 }
