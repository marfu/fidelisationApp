/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisationApp.bean;

import com.ceenet.fidelisation.model.Produit;
import com.ceenet.fidelisation.service.ProduitService;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import javax.faces.application.FacesMessage;

import javax.faces.context.FacesContext;

/**
 *
 * @author manukey
 */
@Named(value = "produitBean")
@SessionScoped
public class ProduitBean implements Serializable {

    @EJB
    private ProduitService produitService;

    private String code;
    private String nom;
    private String photo;
    private int prixProduit;
    private long selectProduit;
    private List<String> r = new ArrayList<String>();
    private String v;
    private List<String> codeBarre;
    
    private List<Produit> produit;

    public List<Produit> getProduit() {
        produit=produitService.listProduit();
        return produit;
    }

    public void setProduit(List<Produit> produit) {
        this.produit = produit;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getPrixProduit() {
        return prixProduit;
    }

    public void setPrixProduit(int prixProduit) {
        this.prixProduit = prixProduit;
    }

    public long getSelectProduit() {
        return selectProduit;
    }

    public void setSelectProduit(long selectProduit) {
        this.selectProduit = selectProduit;
    }

    public List<String> getR() {
        return r;
    }

    public void setR(List<String> r) {
        this.r = r;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public List<String> getCodeBarre() {
        
        return codeBarre;
    }

    public void setCodeBarre(List<String> codeBarre) {
        this.codeBarre = codeBarre;
    }

    
    
    

  

    public String creerProduit() {
        codeBarre = r;

//               produitService.createProduit(code, nom, photo, prixProduit, codeBarre);
               produitService.createProduit(code, nom, photo, prixProduit, r);
               viderList();
        return "success";

    }

    public void deleteProduit() {
        produitService.deleteMagasin(selectProduit);
    }

    public void remplirList(ActionEvent actionEvent) {
        r.add(v);
    }

    public void viderList() {
        
        r.clear();
        code="";
        nom="";
        prixProduit=0;
        photo="";
        v ="";
        
    }

    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
// public void listcodebarre(){
//        Produit p=produitService.findProduit(selectProduit);
//        
//        codeBarre=p.getCodeBarre();
// }
}
