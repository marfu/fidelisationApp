/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisation.daoImpl;

import com.ceenet.fidelisation.dao.CompteClientDao;
import com.ceenet.fidelisation.dto.CompteClientDto;
import com.ceenet.fidelisation.model.CompteClient;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.NoResultException;

/**
 *
 * @author manukey
 */
@Stateless
public class CompteClientDaoImpl extends GenericDaoImpl<CompteClient> implements CompteClientDao{

    public CompteClientDaoImpl() {
    }

    public CompteClientDaoImpl(Class<CompteClient> entityClass) {
        super(entityClass);
    }

    @Override
    public List<CompteClientDto> findAllCompteclient() {
       
        
        List<CompteClientDto> dto=new ArrayList<CompteClientDto>();
        try {
            List<Object[]> resultObject = (List<Object[]>) em.createNativeQuery("SELECT cc.id, cc.codeCompteClient, cc.dateCreationCompte, cc.statut, c.codeClient, c.nom, c.prenom, c.dateCreation " +
"FROM CompteClient cc " +
"left join Client c on c.id=cc.client_id").getResultList();

            for (int i = 0; i < resultObject.size(); i++) {
                   CompteClientDto cdto=new CompteClientDto();
		//System.out.println(temp);
//                cdto.setIdCompte(((BigInteger) resultObject.get(i)[0]).longValue());
//               cdto.setIdClient(((BigInteger) resultObject.get(i)[4]).longValue());
//                cdto.setCodeClient((String) resultObject.get(i)[5]);
//                cdto.setDateCreationClient((Date) resultObject.get(i)[8]);
//                cdto.setDateCreationCompte((Date) resultObject.get(i)[2]);
//                cdto.setCodeCompteClient((String) resultObject.get(i)[1]);
//                cdto.setNomClient((String) resultObject.get(i)[6]);
//                cdto.setPrenomClient((String) resultObject.get(i)[7]);
//                cdto.setStatutCompte((boolean) resultObject.get(i)[3]);
                
                  cdto.setIdCompte(((BigInteger) resultObject.get(i)[0]).longValue());
//               cdto.setIdClient(((BigInteger) resultObject.get(i)[4]).longValue());
                cdto.setCodeClient((String) resultObject.get(i)[4]);
                cdto.setDateCreationClient((Date) resultObject.get(i)[7]);
                cdto.setDateCreationCompte((Date) resultObject.get(i)[2]);
                cdto.setCodeCompteClient((String) resultObject.get(i)[1]);
                cdto.setNomClient((String) resultObject.get(i)[5]);
                cdto.setPrenomClient((String) resultObject.get(i)[6]);
                cdto.setStatutCompte((boolean) resultObject.get(i)[3]);
                
                dto.add(i, cdto);
            }


        } catch (NoResultException e) {
             System.out.println(e.getMessage());
        }
        System.out.println(dto.toString());
        return dto;
        
    }

    

    
    
}
