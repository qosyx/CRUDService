/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.tests;

import com.bootcamp.entities.Commune;
import com.bootcamp.entities.Departement;
import com.bootcamp.service.crud.DepartementCRUD;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.testng.annotations.Test;

/**
 *
 * @author Bello
 */
public class DepartementCrudTest {
    @Test
    public List<Departement> getAllDepartements() throws SQLException{
        return DepartementCRUD.findAll();
    }
    
    @Test
    public List<Commune> getCommunes() throws SQLException{
        Departement dep = DepartementCRUD.getDepartement(151);
        return DepartementCRUD.getAllCommunes(dep);
    }
    
    @Test
    public void createDepartements(){
        Departement dep = new Departement("Zou", 22, 2.066520, 7.346927);
        
        Commune com1 = new Commune ("Bohicon", 2.0667000, 7.1782600);
        Commune com2 = new Commune ("Abomey", 1.9911900, 7.1828600);
        Commune com3 = new Commune ("Zogbodomey", 2.0999996, 7.083333);
        
        ArrayList listCommune = new ArrayList();
        listCommune.add(com1);
        listCommune.add(com2);
        listCommune.add(com3);
        
        dep.setCommuneList(listCommune);

        try {
            DepartementCRUD.create(dep);
        } catch (SQLException ex) {
            Logger.getLogger(DepartementCrudTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
