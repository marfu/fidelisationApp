/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisation.service;

import com.ceenet.fidelisation.dao.ProduitDao;
import com.ceenet.fidelisation.model.Produit;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author manukey
 */
@Stateless
public class ProduitService {

    @EJB
    private ProduitDao produitDao;

    public Produit createProduit(String code, String nom, String photo, int prixProduit, List<String> codeBarre) {
        Produit p = new Produit();
        p.setCode(code);
        p.setNom(nom);
        p.setPhoto(photo);
        p.setPrixProduit(prixProduit);
        p.setCodeBarre(codeBarre);
        return produitDao.create(p);
    }

    public List<Produit> listProduit() {
        return produitDao.findAll();
    }

    public void deleteMagasin(Long selectProduit) {
        Produit p = new Produit();
        p = produitDao.findById(selectProduit);
        produitDao.delete(p);

    }

    public Produit findProduit(Long selectProduit) {
        Produit p = new Produit();
        p = produitDao.findById(selectProduit);
        return p;

    }

}
