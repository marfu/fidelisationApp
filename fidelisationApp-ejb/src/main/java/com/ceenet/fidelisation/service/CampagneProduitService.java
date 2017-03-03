/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisation.service;

import com.ceenet.fidelisation.dao.CampagneDao;
import com.ceenet.fidelisation.dao.CampagneProduitDao;
import com.ceenet.fidelisation.dao.MagasinDao;
import com.ceenet.fidelisation.dao.ProduitDao;
import com.ceenet.fidelisation.dto.CampagneProduitDto;
import com.ceenet.fidelisation.model.Campagne;
import com.ceenet.fidelisation.model.CampagneProduit;
import com.ceenet.fidelisation.model.Magasin;
import com.ceenet.fidelisation.model.Produit;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author manukey
 */
@Stateless
public class CampagneProduitService {

    @EJB
    private CampagneProduitDao campagneProduitDao;
    

    @EJB
    private MagasinDao magasinDao;
    @EJB
    private ProduitDao produitDao;
    @EJB
    private CampagneDao campagneDao;

    public CampagneProduit createCampagneProduit(int pointsAchats, int pointsRecompenses, long magasin, long produit, Long campagne) {
        CampagneProduit cp = new CampagneProduit();
        Produit p = new Produit();
        Magasin m = new Magasin();
        Campagne c = new Campagne();
        p = produitDao.findById(produit);
        m = magasinDao.findById(magasin);
        c = campagneDao.findById(campagne);
        
        cp.setPointsAchats(pointsAchats);
        cp.setPointsRecompenses(pointsRecompenses);
        cp.setMagasin(m);
        cp.setProduit(p);
        cp.setCampagne(c);

        return cp = campagneProduitDao.create(cp);
    }
    public List<CampagneProduitDto> listCampagneProduit() {
        return campagneProduitDao.findAllCampagneProByPar();
    }
//public List<CampagneProduit> listCampagneProduit() {
//        return campagneProduitDao.findAll();
//    }
}
