/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisationApp.bean;

import com.ceenet.fidelisation.model.TypeCampagne;
import com.ceenet.fidelisation.service.TypeCampagneService;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author marfu
 */

@Named(value = "typeCampagneBean")
@SessionScoped
public class TypeCampagneBean implements Serializable {
    
    
    private List<TypeCampagne> typeCampagne;
    
    @EJB
    private TypeCampagneService typeCampagneService;

    public List<TypeCampagne> getTypeCampagne() {
        typeCampagne=typeCampagneService.listTypeCampagne() ;
        return typeCampagne;
    }

    public void setTypeCampagne(List<TypeCampagne> typeCampagne) {
        this.typeCampagne = typeCampagne;
    }
    
    
    
   
    
    
}
