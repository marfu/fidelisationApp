/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisation.daoImpl;

import com.ceenet.fidelisation.dao.CodeProduitsDao;
import com.ceenet.fidelisation.model.CodeProduits;

/**
 *
 * @author manukey
 */
public class CodeProduitsDaoImpl extends GenericDaoImpl<CodeProduits> implements CodeProduitsDao{

    public CodeProduitsDaoImpl() {
    }

    public CodeProduitsDaoImpl(Class<CodeProduits> entityClass) {
        super(entityClass);
    }
    
    
}
