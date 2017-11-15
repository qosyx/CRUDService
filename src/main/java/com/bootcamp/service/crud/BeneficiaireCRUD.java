/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.service.crud;

import com.bootcamp.constants.AppConstants;
import com.bootcamp.entities.Beneficiaire;
import com.bootcamp.jpa.BeneficiaireRepository;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Archange
 */
public class BeneficiaireCRUD implements AppConstants {

    public static boolean create(Beneficiaire beneficiaire) {
        BeneficiaireRepository beneficiaireRepository = new BeneficiaireRepository(AppConstants.PERSISTENCE_UNIT);

        try {
            return beneficiaireRepository.create(beneficiaire);

        } catch (SQLException ex) {

            Logger.getLogger(BeneficiaireCRUD.class.getName()).log(Level.SEVERE, null, ex);

        }
        return false;
    }

    public static boolean update(Beneficiaire beneficiaire) {
        BeneficiaireRepository beneficiaireRepository = new BeneficiaireRepository(AppConstants.PERSISTENCE_UNIT);
        try {
            return beneficiaireRepository.update(beneficiaire);
        } catch (SQLException ex) {
            // TODO Auto-generated catch block
            Logger.getLogger(BeneficiaireCRUD.class.getName()).log(Level.SEVERE, null, ex);

        }
        return false;
    }

    public static Beneficiaire read(String name) {
        BeneficiaireRepository beneficiaireRepository = new BeneficiaireRepository(AppConstants.PERSISTENCE_UNIT);
        try {
            return beneficiaireRepository.findByPropertyUnique("nom", name);

        } catch (SQLException e) {
            Logger.getLogger(BeneficiaireCRUD.class.getName()).log(Level.SEVERE, null, e);

        }
        return null;
    }

    public static List<Beneficiaire> readAll(int idcommune) {
        BeneficiaireRepository beneficiaireRepository = new BeneficiaireRepository(AppConstants.PERSISTENCE_UNIT);
        try {
            return beneficiaireRepository.findByProperty("ID_COMMUNE", idcommune);
        } catch (SQLException e) {
            Logger.getLogger(BeneficiaireCRUD.class.getName()).log(Level.SEVERE, null, e);

        }

        return null;

    }

    public static boolean delete(Beneficiaire beneficiaire) {
        BeneficiaireRepository beneficiaireRepository = new BeneficiaireRepository(AppConstants.PERSISTENCE_UNIT);
        try {
            beneficiaireRepository.delete(beneficiaire);
            return true;
        } catch (SQLException ex) {
            // TODO Auto-generated catch block
            Logger.getLogger(BeneficiaireCRUD.class.getName()).log(Level.SEVERE, null, ex);

        }
        return false;
    }

    public static Beneficiaire read(Long id) {
        BeneficiaireRepository beneficiaireRepository = new BeneficiaireRepository(AppConstants.PERSISTENCE_UNIT);
        try {
            return beneficiaireRepository.findByPropertyUnique("ID_BENEFICIAIRE", id);
            //return beneficiaireRepository.findByProperty("ID_BAILLEUR", id);
        } catch (SQLException e) {
            Logger.getLogger(BeneficiaireCRUD.class.getName()).log(Level.SEVERE, null, e);

        }

        return null;

    }

    public static List<Beneficiaire> readAll() {
        BeneficiaireRepository beneficiaireRepository = new BeneficiaireRepository(AppConstants.PERSISTENCE_UNIT);
        try {
            return beneficiaireRepository.findAll();
        } catch (SQLException ex) {
            Logger.getLogger(BeneficiaireCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
