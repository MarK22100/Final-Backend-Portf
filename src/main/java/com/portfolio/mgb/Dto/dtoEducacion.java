/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.mgb.Dto;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

public class dtoEducacion {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private LocalDate inicioEd;
    @NotBlank
    private LocalDate finEd;
    @NotBlank
    private String img;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreE, String descripcionE, LocalDate inicioEd, LocalDate finEd, String img) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.inicioEd = inicioEd;
        this.finEd = finEd;
        this.img = img;
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

    public LocalDate getInicioEd() {
        return inicioEd;
    }

    public void setInicioEd(LocalDate inicioEd) {
        this.inicioEd = inicioEd;
    }

    public LocalDate getFinEd() {
        return finEd;
    }

    public void setFinEd(LocalDate finEd) {
        this.finEd = finEd;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
