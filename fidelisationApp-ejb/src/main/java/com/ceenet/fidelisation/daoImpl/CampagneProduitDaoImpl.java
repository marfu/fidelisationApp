/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisation.daoImpl;

import com.ceenet.fidelisation.dao.CampagneProduitDao;
import com.ceenet.fidelisation.dto.CampagneProduitDto;
import com.ceenet.fidelisation.model.CampagneProduit;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import javax.persistence.Query;
/**
 *
 * @author manukey
 */
@Stateless
public class CampagneProduitDaoImpl extends GenericDaoImpl<CampagneProduit> implements CampagneProduitDao{

    public CampagneProduitDaoImpl() {
    }

    public CampagneProduitDaoImpl(Class<CampagneProduit> entityClass) {
        super(entityClass);
    }

    @Override
    public List<CampagneProduitDto> findAllCampagneProByPar() {
       
        
        List<CampagneProduitDto> dto=new ArrayList<CampagneProduitDto>();
        try {
            List<Object[]> resultObject = (List<Object[]>) em.createNativeQuery("SELECT cp.id ,c.codeCampagne,c.dateDebut ,c.datefin,c.statut,p.nom,m.libelle,cp.pointsAchats, cp.pointsRecompenses "
                    + "FROM CampagneProduit cp  inner join Campagne c on cp.campagne_id=c.id " +
                        " inner join Produit p on cp.produit_id=p.id " +
                        " inner join Magasin m on cp.magasin_id=m.id ").getResultList();
//            for (Object[] temp : resultObject) {
//                 CampagneProduitDto cdto=new CampagneProduitDto();
//		//System.out.println(temp);
//                cdto.setId((long) temp[0]);
//                cdto.setCodeCampagne((String) temp[1]);
//                cdto.setLibelleMagasin((String) temp[6]);
//                cdto.setDateDebutCampagne((Date) temp[2]);
//                cdto.setDateFinCampagne((Date) temp[3]);
//                cdto.setNomProduit((String) temp[5]);
//                cdto.setPointsRecompenses((Integer) temp[8]);
//                cdto.setPointsAchats((Integer) temp[7]);
//                cdto.setStatutCampagne((boolean) temp[4]);
//                /////////////////////////////////////////
//               
//                
//                ///////////////////////////////
//                
//                dto.add(cdto);
//                System.out.println(cdto.getNomProduit());
//	}
            for (int i = 0; i < resultObject.size(); i++) {
                   CampagneProduitDto cdto=new CampagneProduitDto();
		//System.out.println(temp);
                cdto.setId(((BigInteger) resultObject.get(i)[0]).longValue());
                cdto.setCodeCampagne((String) resultObject.get(i)[1]);
                cdto.setLibelleMagasin((String) resultObject.get(i)[6]);
                cdto.setDateDebutCampagne((Date) resultObject.get(i)[2]);
                cdto.setDateFinCampagne((Date) resultObject.get(i)[3]);
                cdto.setNomProduit((String) resultObject.get(i)[5]);
                cdto.setPointsRecompenses((Integer) resultObject.get(i)[8]);
                cdto.setPointsAchats((Integer) resultObject.get(i)[7]);
                cdto.setStatutCampagne((boolean) resultObject.get(i)[4]);
                dto.add(i, cdto);
            }

//            q.setParameter(1, id);
//            dto = (List<CampagneProduitDto>) q.getResultList();
        } catch (NoResultException e) {
             System.out.println("hjljkljkl");
        }
        System.out.println(dto.toString());
        return dto;
        
    }

    
}
