/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisation.daoImpl;

import com.ceenet.fidelisation.dao.TypeNotificationDao;

import com.ceenet.fidelisation.model.TypeNotification;
import javax.ejb.Stateless;

/**
 *
 * @author manukey
 */
@Stateless
public class TypeNotificationDaoImpl extends GenericDaoImpl<TypeNotification> implements TypeNotificationDao{
     
    public TypeNotificationDaoImpl() {
    }
    public TypeNotificationDaoImpl(Class<TypeNotification> entityClass) {
        super(entityClass);
    }
}
