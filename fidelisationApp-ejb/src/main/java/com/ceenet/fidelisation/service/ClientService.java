/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisation.service;

import com.ceenet.fidelisation.dao.ClientDao;
import com.ceenet.fidelisation.model.Client;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author manukey
 */
@Stateless
public class ClientService {
    @EJB
    private ClientDao clientDao;
    
    public Client CreateClient(String code,String nom,String prenom,String email,String password) {
        Client c = new Client();
        c.setCodeClient(code);
        c.setEmail(email);
        c.setPassword(password);
        c.setPrenom(prenom);
        c.setNom(nom);
        Date created_at = new Date();
        c.setDateCreation(created_at);
        return c = clientDao.create(c);
    }
    
    public List<Client> listClient(){
        return clientDao.findAll();
    }
    
//    public Client
}
