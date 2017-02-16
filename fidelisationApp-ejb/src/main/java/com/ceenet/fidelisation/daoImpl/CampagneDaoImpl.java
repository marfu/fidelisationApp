/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisation.daoImpl;

import com.ceenet.fidelisation.dao.CampagneDao;
import com.ceenet.fidelisation.model.Campagne;
import javax.ejb.Stateless;

/**
 *
 * @author manukey
 */
@Stateless
public class CampagneDaoImpl extends GenericDaoImpl<Campagne> implements CampagneDao{
    
    public CampagneDaoImpl() {
    }
    public CampagneDaoImpl(Class<Campagne> entityClass) {
        super(entityClass);
    }
}
