/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisation.service;

import com.ceenet.fidelisation.dao.CompteClientDao;
import com.ceenet.fidelisation.model.CompteClient;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author marfu
 */
@Stateless
public class CompteClientService {

    @EJB
    private CompteClientDao compteClientDao;

    public CompteClient CreateCompteClient(String code, String libelle) {
        CompteClient cc = new CompteClient();
        cc.setCodeCompteClient(code);
        Date created_at = new Date();
        cc.setDateCreationCompte(created_at);
        
        // cc.;
        
        return cc = compteClientDao.create(cc);
    }
    
    

    public List<CompteClient> listCompteClient() {
        return compteClientDao.findAll();
    }

}
