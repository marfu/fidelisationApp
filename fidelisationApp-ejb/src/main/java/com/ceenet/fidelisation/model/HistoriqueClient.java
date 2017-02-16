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

import javax.persistence.Temporal;

/**
 *
 * @author manukey
 */
@Entity
public class HistoriqueClient implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int NbrePoint;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateHistorique;
    
 
    
    
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNbrePoint() {
        return NbrePoint;
    }

    public void setNbrePoint(int NbrePoint) {
        this.NbrePoint = NbrePoint;
    }

    public Date getDate() {
        return dateHistorique;
    }

    public void setDate(Date dateHistorique) {
        this.dateHistorique = dateHistorique;
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
        if (!(object instanceof HistoriqueClient)) {
            return false;
        }
        HistoriqueClient other = (HistoriqueClient) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ceenet.fidelisation.model.HistoriqueClient[ id=" + id + " ]";
    }
    
}
