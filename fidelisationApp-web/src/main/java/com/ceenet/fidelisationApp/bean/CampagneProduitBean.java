/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisationApp.bean;

import com.ceenet.fidelisation.dao.CampagneProduitDao;
import com.ceenet.fidelisation.dto.CampagneProduitDto;
import com.ceenet.fidelisation.model.CampagneProduit;
import com.ceenet.fidelisation.service.CampagneProduitService;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author manukey
 */
@Named(value = "campagneProduitBean")
@SessionScoped
public class CampagneProduitBean implements Serializable {

    @EJB
    private CampagneProduitService campagneProduitService;

    private List<CampagneProduitDto> listCampagneProduit;

    private int pointsAchats;
    private int pointsRecompenses;
    private long campagne;
    private long selectCampagneProduit;
    private long produit;
    private long magasin;

    public List<CampagneProduitDto> getListCampagneProduit() {
        listCampagneProduit=campagneProduitService.listCampagneProduit();
        return listCampagneProduit;
    }

    public void setListCampagneProduit(List<CampagneProduitDto> listCampagneProduit) {
        this.listCampagneProduit = listCampagneProduit;
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

    public long getCampagne() {
        return campagne;
    }

    public void setCampagne(long campagne) {
        this.campagne = campagne;
    }

    public long getSelectCampagneProduit() {
        return selectCampagneProduit;
    }

    public void setSelectCampagneProduit(long selectCampagneProduit) {
        this.selectCampagneProduit = selectCampagneProduit;
    }

    public long getProduit() {
        return produit;
    }

    public void setProduit(long produit) {
        this.produit = produit;
    }

    public long getMagasin() {
        return magasin;
    }

    public void setMagasin(long magasin) {
        this.magasin = magasin;
    }
    
    
    
    public String creerCampagneProduit() {
        
        
       campagneProduitService.createCampagneProduit(pointsAchats, pointsRecompenses, magasin, produit, campagne);
          
        return "success";
    }
    
    
     public void deleteCampagneProduit() {
         
         
       
    }

}
