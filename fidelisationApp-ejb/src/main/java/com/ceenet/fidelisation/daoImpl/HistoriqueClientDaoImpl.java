/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisation.daoImpl;

import com.ceenet.fidelisation.dao.HistoriqueClientDao;
import com.ceenet.fidelisation.model.HistoriqueClient;
import javax.ejb.Stateless;



@Stateless
public class HistoriqueClientDaoImpl extends GenericDaoImpl<HistoriqueClient> implements HistoriqueClientDao {
  public HistoriqueClientDaoImpl() {
    }

    public HistoriqueClientDaoImpl(Class<HistoriqueClient> entityClass) {
        super(entityClass);
    }
    
}

