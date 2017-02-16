/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisation.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

/**
 *
 * @author marfu
 */
@Entity
public class CampagneProduit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int pointsAchats;
    private int pointsRecompenses;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Magasin magasin;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Produit produit;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Campagne campagne;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Magasin getMagasin() {
        return magasin;
    }

    public void setMagasin(Magasin magasin) {
        this.magasin = magasin;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Campagne getCampagne() {
        return campagne;
    }

    public void setCampagne(Campagne campagne) {
        this.campagne = campagne;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CampagneProduit)) {
            return false;
        }
        CampagneProduit other = (CampagneProduit) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ceenet.fidelisation.model.CampagneProduit[ id=" + id + " ]";
    }
    
}
