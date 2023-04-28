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
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate inicioExp;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate finExp;
    private String img;
    
    //Constructores

    public Experiencia() {
    }

    public Experiencia(String nombreE, String descripcionE, LocalDate inicioExp, LocalDate finExp, String img) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.inicioExp = inicioExp;
        this.finExp = finExp;
        this.img = img;
    }
    
    //Getters and setters

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
