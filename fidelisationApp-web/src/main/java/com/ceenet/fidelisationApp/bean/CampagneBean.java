/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisationApp.bean;

import com.ceenet.fidelisation.model.Campagne;
import com.ceenet.fidelisation.service.CampagneService;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;

import javax.inject.Named;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author marfu
 */
@Named(value = "campagneBean")
@SessionScoped
public class CampagneBean implements Serializable {

    @EJB
    private CampagneService campagneService;
    
    private List<Campagne> listCampagne;

    private String libelle;
    private Date dateDebut;
    private Date dateFin;
    private boolean statut;
    private long typeCampagne;
    private long selectCampagne;
    
    
    public long getSelectCampagne() {
        return selectCampagne;
    }

    public void setSelectCampagne(long selectCampagne) {
        this.selectCampagne = selectCampagne;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public boolean isStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    

    public long getTypeCampagne() {
        return typeCampagne;
    }

    public void setTypeCampagne(long typeCampagne) {
        this.typeCampagne = typeCampagne;
    }

    public List<Campagne> getListCampagne() {
        listCampagne=campagneService.listCampagne();
        return listCampagne;
    }

    public void setListCampagne(List<Campagne> listCampagne) {
        this.listCampagne = listCampagne;
    }
    
    
    
    
    public String creerCampagne() {
        //  System.out.print("xxxx");
        
        campagneService.createCampagne(libelle, dateDebut, dateFin,statut,typeCampagne);
          
        return "success";
    }
    
    
     public void deleteCampagne() {
         
         
       
    }
    
    
    public void onRowEdit(RowEditEvent event) {
       
    }

    public void onRowCancel(RowEditEvent event) {
       
    }


}
