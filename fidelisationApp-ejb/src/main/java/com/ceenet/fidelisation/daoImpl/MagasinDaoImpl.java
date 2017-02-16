/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisation.daoImpl;

import com.ceenet.fidelisation.dao.MagasinDao;
import com.ceenet.fidelisation.model.Magasin;
import javax.ejb.Stateless;

/**
 *
 * @author manukey
 */
@Stateless
public class MagasinDaoImpl extends GenericDaoImpl<Magasin> implements MagasinDao{
     public MagasinDaoImpl() {
    }
    public MagasinDaoImpl(Class<Magasin> entityClass) {
        super(entityClass);
    }

}
