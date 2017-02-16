/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisation.daoImpl;

import com.ceenet.fidelisation.dao.TypeOperationDao;
import com.ceenet.fidelisation.model.TypeOperation;
import javax.ejb.Stateless;

/**
 *
 * @author manukey
 */
@Stateless
public class TypeOperationDaoImpl extends GenericDaoImpl<TypeOperation> implements TypeOperationDao {
    
     public TypeOperationDaoImpl() {
    }
    public TypeOperationDaoImpl(Class<TypeOperation> entityClass) {
        super(entityClass);
    }
}
