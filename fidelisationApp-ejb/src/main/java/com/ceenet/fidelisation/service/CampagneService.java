/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisation.service;

import com.ceenet.fidelisation.dao.CampagneDao;
import com.ceenet.fidelisation.dao.TypeCampagneDao;
import com.ceenet.fidelisation.model.Campagne;
import com.ceenet.fidelisation.model.TypeCampagne;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author marfu
 */
@Stateless
public class CampagneService {
    
    @EJB
    private CampagneDao campagneDao;
    
    @EJB
    private TypeCampagneDao typeCampagneDao;
    
    public Campagne createCampagne(String libelle, Date dateDebut, Date dateFin, boolean statut, Long typeCampagne) {
        Campagne t = new Campagne();
        TypeCampagne ty = new TypeCampagne();
        ty = typeCampagneDao.findById(typeCampagne);
        Date created_at = new Date();
        t.setCodeCampagne(libelle);
        t.setDateDebut(dateDebut);
        t.setDateFin(dateFin);
        t.setDateCreation(created_at);
        t.setStatut(statut); 
        t.setTypeCampagne(ty);
        
        return t = campagneDao.create(t);
    }
    
    public List<Campagne> listCampagne() {
        return campagneDao.findAll();
    }
}
