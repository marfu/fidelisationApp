/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisation.dto;

import java.util.Date;

/**
 *
 * @author manukey
 */
public class CampagneProduitDto {

    private Long id;
    private String codeCampagne;
    private Date dateDebutCampagne;
    private Date dateFinCampagne;
    private boolean statutCampagne;
    private String nomProduit;
    private String LibelleMagasin;
    private int pointsAchats;
    private int pointsRecompenses;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeCampagne() {
        return codeCampagne;
    }

    public void setCodeCampagne(String codeCampagne) {
        this.codeCampagne = codeCampagne;
    }

    public Date getDateDebutCampagne() {
        return dateDebutCampagne;
    }

    public void setDateDebutCampagne(Date dateDebutCampagne) {
        this.dateDebutCampagne = dateDebutCampagne;
    }

    public Date getDateFinCampagne() {
        return dateFinCampagne;
    }

    public void setDateFinCampagne(Date dateFinCampagne) {
        this.dateFinCampagne = dateFinCampagne;
    }

    public boolean isStatutCampagne() {
        return statutCampagne;
    }

    public void setStatutCampagne(boolean statutCampagne) {
        this.statutCampagne = statutCampagne;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public String getLibelleMagasin() {
        return LibelleMagasin;
    }

    public void setLibelleMagasin(String LibelleMagasin) {
        this.LibelleMagasin = LibelleMagasin;
    }

    public int getPointsAchats() {
        return pointsAchats;
    }

    public void setPointsAchats(int pointsAchats) {
        this.pointsAchats = pointsAchats;
    }

    public int getPointsRecompenses() {
        return pointsRecompenses;
    }

    public void setPointsRecompenses(int pointsRecompenses) {
        this.pointsRecompenses = pointsRecompenses;
    }

}
