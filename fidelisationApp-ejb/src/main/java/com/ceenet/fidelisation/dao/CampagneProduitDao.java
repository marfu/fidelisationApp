/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisation.dao;
import com.ceenet.fidelisation.dto.CampagneProduitDto;
import com.ceenet.fidelisation.model.CampagneProduit;
import java.util.List;
/**
 *
 * @author manukey
 */
public interface CampagneProduitDao extends GenericDao<CampagneProduit>{
   public List<CampagneProduitDto> findAllCampagneProByPar();
}
