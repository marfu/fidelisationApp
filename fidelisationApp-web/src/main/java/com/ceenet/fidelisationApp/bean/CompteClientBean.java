/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisationApp.bean;

import com.ceenet.fidelisation.model.CompteClient;
import com.ceenet.fidelisation.service.CompteClientService;
import java.io.Serializable;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import java.util.Random;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.util.UUID;

/**
 *
 * @author marfu
 */
@Named(value = "compteClientBean")
@SessionScoped
public class CompteClientBean implements Serializable {

    
    
    @EJB
    private CompteClientService compteClientService;

    private List<CompteClient> listClientService;

    private String codeClient;
    
    private Boolean statut;
    
    private String nomClient;
    private String prenomClient;
    private String addressClient;
    private String telephoneClient;
//    private Date dateDebut;
//    private Date dateFin;
//    private boolean statut;
//    private long typeCampagne;
//    private long selectCampagne;

    public Boolean getStatut() {
        return statut;
    }

    public void setStatut(Boolean statut) {
        this.statut = statut;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getPrenomClient() {
        return prenomClient;
    }

    public void setPrenomClient(String prenomClient) {
        this.prenomClient = prenomClient;
    }

    public String getAddressClient() {
        return addressClient;
    }

    public void setAddressClient(String addressClient) {
        this.addressClient = addressClient;
    }

    public String getTelephoneClient() {
        return telephoneClient;
    }

    public void setTelephoneClient(String telephoneClient) {
        this.telephoneClient = telephoneClient;
    }

    
    
    public String getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(String codeClient) {
        this.codeClient = codeClient;
    }

    public List<CompteClient> getListClientService() {
        listClientService = compteClientService.listCompteClient();
        return listClientService;
    }

    public void setListClientService(List<CompteClient> listClientService) {
        this.listClientService = listClientService;
    }

    
     public void generateCodeClient() throws NoSuchAlgorithmException, InvalidKeySpecException {
        //String originalPassword = Integer.toString(gen());
       // System.out.println(originalPassword);
        codeClient = UUID.randomUUID().toString();
        // String generatedSecuredPasswordHash = PasswordGenerator.generateStorngPasswordHash(originalPassword);
        //codeClient = originalPassword;
    }
     
      public int gen() {
        Random r = new Random(System.currentTimeMillis());
        return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
    }
      
      
      public String creerCompteClient(String nom,String prenom,String addr,String telephone  ){
          
          
          return "success";
      
      }
}
