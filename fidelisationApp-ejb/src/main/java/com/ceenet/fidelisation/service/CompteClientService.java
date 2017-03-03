/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisation.service;

import com.ceenet.fidelisation.dao.ClientDao;
import com.ceenet.fidelisation.dao.CompteClientDao;
import com.ceenet.fidelisation.dto.CompteClientDto;
import com.ceenet.fidelisation.model.Client;
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

    @EJB
    private ClientDao clientDao;
    
    public CompteClient CreateCompteClient(String code,Boolean statut,long client) {
        CompteClient cc = new CompteClient();
        Client c = new Client();
        c=clientDao.findById(client);
        
        cc.setCodeCompteClient(code);
        Date created_at = new Date();
        cc.setDateCreationCompte(created_at);
        cc.setStatut(statut);
        if(c!=null){
            
            cc.setClient(c);
        }
        
        return cc = compteClientDao.create(cc);
    }
    
    

    public List<CompteClient> listCompteClient() {
        return compteClientDao.findAll();
    }
    
     public List<CompteClientDto> listCompteClientgeneral() {
        return compteClientDao.findAllCompteclient();
    }

}
