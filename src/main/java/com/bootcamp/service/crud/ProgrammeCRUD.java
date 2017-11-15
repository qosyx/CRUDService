
package com.bootcamp.service.crud;


import com.bootcamp.entities.Programme;
import com.bootcamp.jpa.ProgrammeRepository;
import com.bootcamp.constants.AppConstants;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author soul
 */
public class ProgrammeCRUD implements AppConstants{

    public static boolean create(Programme programme){

        try {
            ProgrammeRepository progRepo=new ProgrammeRepository(PERSISTENCE_UNIT);
            progRepo.create(programme);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProgrammeCRUD.class.getName()).log(Level.SEVERE, null, ex);
         return false;
        }
       
    }
      public static void read(){

        try {
            ProgrammeRepository progRepo=new ProgrammeRepository(PERSISTENCE_UNIT);
            progRepo.findAll();

        } catch (SQLException ex) {
            Logger.getLogger(ProgrammeCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void read(Programme programme){
        ProgrammeRepository progRepo=new ProgrammeRepository(PERSISTENCE_UNIT);

        try {
            progRepo.update(programme);
        } catch (SQLException ex) {
            Logger.getLogger(ProgrammeCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void delete(Programme programme){
        ProgrammeRepository progRepo=new ProgrammeRepository(PERSISTENCE_UNIT);
        try {
            progRepo.delete(programme);
        } catch (SQLException ex) {
            Logger.getLogger(ProgrammeCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
