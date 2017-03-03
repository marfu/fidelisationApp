/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisation.service;

import com.ceenet.fidelisation.dao.MagasinDao;
import com.ceenet.fidelisation.model.Magasin;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author manukey
 */
@Stateless
public class MagasinService {
    @EJB
    private MagasinDao MagasinDao;
    
    
    public Magasin CreateMagasin(String code,String libelle){
        Magasin m= new Magasin();
        m.setCode(code);
        m.setLibelle(libelle);
        return m = MagasinDao.create(m);
    }
    
    public List<Magasin> listMagasin() {
        return MagasinDao.findAll();
    }
    
    public void deleteMagasin(Long selectMagasin){
    Magasin m=new Magasin();
    m=MagasinDao.findById(selectMagasin);
    MagasinDao.delete(m);
    
    }
    
    public void updateMagasin(Long selectMagasin,String code,String libelle){
    Magasin m=new Magasin();
    m=MagasinDao.findById(selectMagasin);
    m.setCode(code);
    m.setLibelle(libelle); 
    MagasinDao.update(m);
   
    
    }
    
}
