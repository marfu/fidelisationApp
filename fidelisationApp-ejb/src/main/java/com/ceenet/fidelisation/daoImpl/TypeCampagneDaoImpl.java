/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisation.daoImpl;

import com.ceenet.fidelisation.dao.TypeCampagneDao;
import com.ceenet.fidelisation.model.TypeCampagne;
import javax.ejb.Stateless;

/**
 *
 * @author manukey
 */
@Stateless
public class TypeCampagneDaoImpl extends GenericDaoImpl<TypeCampagne> implements TypeCampagneDao{
 public TypeCampagneDaoImpl() {
    }
    public TypeCampagneDaoImpl(Class<TypeCampagne> entityClass) {
        super(entityClass);
    }   
}
