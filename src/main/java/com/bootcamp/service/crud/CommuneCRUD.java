/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.service.crud;

import static com.bootcamp.constants.AppConstants.PERSISTENCE_UNIT;
import com.bootcamp.entities.Commune;
import com.bootcamp.jpa.CommuneRepository;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bello
 */
public class CommuneCRUD {
    public static void create(Commune commune) throws SQLException{
        CommuneRepository dep = new CommuneRepository(PERSISTENCE_UNIT);
        dep.create(commune);
    }
    
    public static void update(Commune commune) throws SQLException{
        CommuneRepository dep = new CommuneRepository(PERSISTENCE_UNIT);
        dep.update(commune);
    }
    
    public static void delete(Commune commune) throws SQLException{
        CommuneRepository dep = new CommuneRepository(PERSISTENCE_UNIT);
        dep.delete(commune);
    }
    
    public static List<Commune> findAll() throws SQLException{
        CommuneRepository dep = new CommuneRepository(PERSISTENCE_UNIT);
        List<Commune> liste =dep.findAll();
        return liste;
    }
    
    public static List<Commune> findByProperty(String propertyName, Object value) throws SQLException{
        CommuneRepository dep = new CommuneRepository(PERSISTENCE_UNIT);
        List<Commune> communes = dep.findByProperty(propertyName, value);
        
        return communes;
    }
    
    public static Commune getCommune(int idCommune) throws SQLException{
        String propertyName = "id";
        CommuneRepository dep = new CommuneRepository(PERSISTENCE_UNIT);
        Commune commune = dep.findByProperty(propertyName, idCommune).get(0);
        
        return commune;
    }
}
