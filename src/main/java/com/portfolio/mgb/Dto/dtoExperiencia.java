/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.mgb.Dto;


import javax.validation.constraints.NotBlank;
import java.time.LocalDate;


public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private LocalDate inicioExp;
    @NotBlank
    private LocalDate finExp;
    @NotBlank
    private String img;
    
    //Constructores

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE,LocalDate inicioExp, LocalDate finExp, String img) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.inicioExp = inicioExp;
        this.finExp = finExp;
        this.img = img;
    }
//Getters & Setters

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

    public LocalDate getInicioExp() {
        return inicioExp;
    }

    public void setInicioExp(LocalDate inicioExp) {
        this.inicioExp = inicioExp;
    }

    public LocalDate getFinExp() {
        return finExp;
    }

    public void setFinExp(LocalDate finExp) {
        this.finExp = finExp;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
