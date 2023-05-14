/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jd.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;
    private String anioI;
    private String anioF;
            
    
    //Constructores
    

    public Experiencia() {
    }

    public Experiencia(String nombreE, String descripcionE, String anioI, String anioF) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.anioI = anioI;
        this.anioF = anioF;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getAnioI() {
        return anioI;
    }

    public void setAnioI(String anioI) {
        this.anioI = anioI;
    }

    public String getAnioF() {
        return anioF;
    }

    public void setAnioF(String anioF) {
        this.anioF = anioF;
    }

}
