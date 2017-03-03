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
public class CompteClientDto {

    private Long idClient;
    private String codeClient;
    private String nomClient;
    private String prenomClient;
    private Date dateCreationClient;
    private Long idCompte;
    private String codeCompteClient;
    private Date dateCreationCompte;
    private Boolean statutCompte;

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(String codeClient) {
        this.codeClient = codeClient;
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

    public Date getDateCreationClient() {
        return dateCreationClient;
    }

    public void setDateCreationClient(Date dateCreationClient) {
        this.dateCreationClient = dateCreationClient;
    }

    public Long getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(Long idCompte) {
        this.idCompte = idCompte;
    }

    public String getCodeCompteClient() {
        return codeCompteClient;
    }

    public void setCodeCompteClient(String codeCompteClient) {
        this.codeCompteClient = codeCompteClient;
    }

    public Date getDateCreationCompte() {
        return dateCreationCompte;
    }

    public void setDateCreationCompte(Date dateCreationCompte) {
        this.dateCreationCompte = dateCreationCompte;
    }

    public Boolean getStatutCompte() {
        return statutCompte;
    }

    public void setStatutCompte(Boolean statutCompte) {
        this.statutCompte = statutCompte;
    }
    
    

}
