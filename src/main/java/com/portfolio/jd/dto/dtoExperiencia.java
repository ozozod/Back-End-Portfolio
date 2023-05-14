/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jd.dto;

import javax.validation.constraints.NotBlank;

public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String anioI;
    @NotBlank
    private String anioF;
    //Constructores

    public dtoExperiencia() {
    }
    
    public dtoExperiencia(String nombreE, String descripcionE, String anioI, String anioF) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.anioI = anioI;
        this.anioF = anioF;
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