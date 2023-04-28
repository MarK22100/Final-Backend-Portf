/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.mgb.Entity;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate inicioEd;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate finEd;
    private String img;
    public Educacion() {
    }

    public Educacion(String nombreE, String descripcionE, LocalDate inicioEd, LocalDate finEd, String img) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.inicioEd = inicioEd;
        this.finEd = finEd;
        this.img = img;
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
