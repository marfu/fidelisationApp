/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisation.service;


import com.ceenet.fidelisation.dao.CampagneDao;
import com.ceenet.fidelisation.model.Campagne;
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
    private CampagneDao communeDao;
    
    public Campagne createCampagne( String libelle,Date dateDebut, Date dateFin ,boolean statut) {
           Campagne t = new Campagne();
          t.setCodeCampagne(libelle);
          t.setDateDebut(dateDebut);
          t.setDateFin(dateFin);
          t.setDateCreation(dateFin);
          t.setStatut(statut);
        
           
        
        return t=communeDao.create(t);
    }
    
    
    public  List<Campagne> listCampagne(){
    return communeDao.findAll();
    }
}
