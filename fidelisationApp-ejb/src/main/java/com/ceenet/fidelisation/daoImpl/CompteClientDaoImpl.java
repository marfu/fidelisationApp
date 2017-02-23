/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisation.daoImpl;

import com.ceenet.fidelisation.dao.CompteClientDao;
import com.ceenet.fidelisation.model.CompteClient;

/**
 *
 * @author manukey
 */
public class CompteClientDaoImpl extends GenericDaoImpl<CompteClient> implements CompteClientDao{

    public CompteClientDaoImpl() {
    }

    public CompteClientDaoImpl(Class<CompteClient> entityClass) {
        super(entityClass);
    }
    
    
}
