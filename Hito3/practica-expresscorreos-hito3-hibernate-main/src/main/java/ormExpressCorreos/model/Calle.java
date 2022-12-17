package ormExpressCorreos.model;

import javax.persistence.*;

 @Entity
 @Table
public class Calle {

     @Id
     @Column (nullable = false)
     private String Ncalle;

     @Id
     @Column(nullable = false)
     private String NMunicipio;

     public Calle(String ncalle, String NMunicipio) {
         Ncalle = ncalle;
         this.NMunicipio = NMunicipio;
     }

     public String getNcalle() {
         return Ncalle;
     }

     public String getNMunicipio() {
         return NMunicipio;
     }
 }
