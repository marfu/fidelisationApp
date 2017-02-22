/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisation.service;

import com.ceenet.fidelisation.dao.CampagneDao;
import com.ceenet.fidelisation.dao.TypeCampagneDao;
import com.ceenet.fidelisation.model.TypeCampagne;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author marfu
 */

@Stateless
public class TypeCampagneService {
    
    
     @EJB
    private TypeCampagneDao typeCampagneDao;
     
    public  List<TypeCampagne> listTypeCampagne(){
    return typeCampagneDao.findAll();
    }
}
