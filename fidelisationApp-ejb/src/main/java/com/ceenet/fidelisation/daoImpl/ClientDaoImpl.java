/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisation.daoImpl;

import com.ceenet.fidelisation.dao.ClientDao;
import com.ceenet.fidelisation.model.Client;
import javax.ejb.Stateless;

/**
 *
 * @author marfu
 */

@Stateless
public class ClientDaoImpl extends GenericDaoImpl<Client> implements ClientDao {
    
     public ClientDaoImpl() {
    }

    public ClientDaoImpl(Class<Client> entityClass) {
        super(entityClass);
    }
    
}
