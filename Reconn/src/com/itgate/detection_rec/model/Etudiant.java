/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itgate.detection_rec.model;

/**
 *
 * @author TOSHIBA
 */
public class Etudiant {

    private int id;
    private String nom;
    private String prenom;
    private String img;
    private String code;

    public Etudiant() {
    }

    public Etudiant(String nom, String prenom, String img, String code) {
        this.nom = nom;
        this.prenom = prenom;
        this.img = img;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
