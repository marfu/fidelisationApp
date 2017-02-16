/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisation.daoImpl;



import com.ceenet.fidelisation.dao.NotificationDao;

import com.ceenet.fidelisation.model.Notification;
import javax.ejb.Stateless;

/**
 *
 * @author manukey
 */
@Stateless
public class NotificationDaoImpl extends GenericDaoImpl<Notification> implements NotificationDao{
      public NotificationDaoImpl() {
    }

    public NotificationDaoImpl(Class<Notification> entityClass) {
        super(entityClass);
    }
    
}
