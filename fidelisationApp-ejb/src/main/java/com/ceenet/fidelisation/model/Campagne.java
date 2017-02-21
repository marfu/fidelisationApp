/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisation.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.FetchType;


/**
 *
 * @author manukey
 */
@Entity
public class Campagne implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codeCampagne;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateDebut;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateFin;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateCreation;
    
    private boolean statut;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private TypeCampagne typeCampagne;

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

    public TypeCampagne getTypeCampagne() {
        return typeCampagne;
    }

    public void setTypeCampagne(TypeCampagne typeCampagne) {
        this.typeCampagne = typeCampagne;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public boolean isStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
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
        if (!(object instanceof Campagne)) {
            return false;
        }
        Campagne other = (Campagne) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ceenet.fidelisation.model.Campagne[ id=" + id + " ]";
    }

}
