/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisation.daoImpl;

import com.ceenet.fidelisation.dao.ProduitDao;
import com.ceenet.fidelisation.model.Produit;
import javax.ejb.Stateless;

/**
 *
 * @author manukey
 */
//@Stateless
public class ProduitDaoImpl extends GenericDaoImpl<Produit> implements ProduitDao{
     public ProduitDaoImpl() {
    }
    public ProduitDaoImpl(Class<Produit> entityClass) {
        super(entityClass);
    }

    
}
