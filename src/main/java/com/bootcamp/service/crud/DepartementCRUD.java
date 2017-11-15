/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.service.crud;

import static com.bootcamp.constants.AppConstants.PERSISTENCE_UNIT;
import com.bootcamp.entities.Commune;
import com.bootcamp.entities.Departement;
import com.bootcamp.jpa.CommuneRepository;
import com.bootcamp.jpa.DepartementRepository;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bello
 */
public class DepartementCRUD {
    public static void create(Departement departement) throws SQLException{
        DepartementRepository dep = new DepartementRepository(PERSISTENCE_UNIT);
        dep.create(departement);
    }
    
    public static void update(Departement departement) throws SQLException{
        DepartementRepository dep = new DepartementRepository(PERSISTENCE_UNIT);
        dep.update(departement);
    }
    
    public static void delete(Departement departement) throws SQLException{
        DepartementRepository dep = new DepartementRepository(PERSISTENCE_UNIT);
        dep.delete(departement);
    }
    
    public static List<Departement> findAll() throws SQLException{
        DepartementRepository dep = new DepartementRepository(PERSISTENCE_UNIT);
        List<Departement> liste =dep.findAll();
        return liste;
    }
    
    public static List<Departement> findByProperty(String propertyName, Object value) throws SQLException{
        DepartementRepository dep = new DepartementRepository(PERSISTENCE_UNIT);
        List<Departement> departements = dep.findByProperty(propertyName, value);
        
        return departements;
    }
    
    public static Departement getDepartement(int idDepartement) throws SQLException{
        String propertyName = "id";
        DepartementRepository dep = new DepartementRepository(PERSISTENCE_UNIT);
        Departement departement = dep.findByProperty(propertyName, idDepartement).get(0);
        
        return departement;
    }
    
    public static List<Commune> getAllCommunes(Departement departement) throws SQLException{
        String propertyName = "departement";
        CommuneRepository com = new CommuneRepository(PERSISTENCE_UNIT);
        List<Commune> communes = com.findByProperty(propertyName, departement);
        
        return communes;
    }
}
