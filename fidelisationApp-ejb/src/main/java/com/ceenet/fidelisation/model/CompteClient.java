/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisation.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author marfu
 */
@Entity
public class CompteClient implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String codeCompteClient;   
    @OneToOne(fetch = FetchType.LAZY,optional=true)
    private Client client;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateCreationCompte;
    
    private Boolean statut;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeCompteClient() {
        return codeCompteClient;
    }

    public void setCodeCompteClient(String codeCompteClient) {
        this.codeCompteClient = codeCompteClient;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getDateCreationCompte() {
        return dateCreationCompte;
    }

    public void setDateCreationCompte(Date dateCreationCompte) {
        this.dateCreationCompte = dateCreationCompte;
    }

    public Boolean getStatut() {
        return statut;
    }

    public void setStatut(Boolean statut) {
        this.statut = statut;
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
        if (!(object instanceof CompteClient)) {
            return false;
        }
        CompteClient other = (CompteClient) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ceenet.fidelisation.model.CompteClient[ id=" + id + " ]";
    }
    
}
