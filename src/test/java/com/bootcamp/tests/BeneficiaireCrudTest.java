/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.tests;

import static com.bootcamp.constants.AppConstants.PERSISTENCE_UNIT;
import com.bootcamp.entities.Beneficiaire;
import com.bootcamp.entities.Projet;
import com.bootcamp.jpa.BeneficiaireRepository;
import com.bootcamp.jpa.ProjetRepository;
import com.bootcamp.service.crud.BeneficiaireCRUD;
import java.sql.SQLException;
import org.testng.annotations.Test;

/**
 *
 * @author Archange
 */
public class BeneficiaireCrudTest {

    @Test
    public void createBeneficiaire() {
        Beneficiaire b = new Beneficiaire("TOTO", 1);
        Beneficiaire b1 = new Beneficiaire("ALOUNKOUN", 2);
        Beneficiaire b2 = new Beneficiaire("GANDONOU", 3);
        Beneficiaire b3 = new Beneficiaire("ASSA", 3);
        BeneficiaireCRUD.create(b1);
        BeneficiaireCRUD.create(b2);
        BeneficiaireCRUD.create(b3);

    }

    @Test
    public void readAll() {
        for (Beneficiaire beneficiaire : BeneficiaireCRUD.readAll()) {
            System.out.println(beneficiaire.getNom() + " commune " + beneficiaire.getCommune());
        }
    }

}
