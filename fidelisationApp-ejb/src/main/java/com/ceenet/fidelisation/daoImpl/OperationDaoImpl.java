/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisation.daoImpl;
import com.ceenet.fidelisation.dao.OperationDao;
import com.ceenet.fidelisation.model.Operation;
/**
 *
 * @author manukey
 */
public class OperationDaoImpl extends GenericDaoImpl<Operation> implements OperationDao{
    
      public OperationDaoImpl() {
    }
    public OperationDaoImpl(Class<Operation> entityClass) {
        super(entityClass);
    }
}
