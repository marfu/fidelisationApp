/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.fidelisationApp.bean;

import com.ceenet.fidelisation.model.Magasin;
import com.ceenet.fidelisation.service.MagasinService;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author manukey
 */
@Named(value = "magasinBean")
@SessionScoped
public class MagasinBean implements Serializable {

    @EJB
    private MagasinService magasinService;

    private String code;
    private String libelle;
    private List<Magasin> magasin;
    private long selectMagasin;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String creerMagasin() {
        magasinService.CreateMagasin(code, libelle);
        return "success";

    }

    public List<Magasin> getMagasin() {
        magasin = magasinService.listMagasin();
        return magasin;
    }

    public long getSelectMagasin() {
        return selectMagasin;
    }

    public void setSelectMagasin(long selectMagasin) {
        this.selectMagasin = selectMagasin;
    }

    public void deleteMagasin() {

        //System.out.println("id:" + selectMagasin);
        magasinService.deleteMagasin(selectMagasin);

    }

}
