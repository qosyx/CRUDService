
package com.bootcamp.service.crud;


import com.bootcamp.entities.Programme;
import com.bootcamp.jpa.ProgrammeRepository;
import com.bootcamp.constants.AppConstants;
import com.bootcamp.entities.PhaseProgramme;
import com.bootcamp.jpa.PhaseProgrammeRepository;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author soul
 */
public class PhaseProgrammeCRUD implements AppConstants{

    public static boolean create(PhaseProgramme phase){

        try {
            PhaseProgrammeRepository phaseRepo=new PhaseProgrammeRepository(PERSISTENCE_UNIT);
            phaseRepo.create(phase);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(PhaseProgrammeCRUD.class.getName()).log(Level.SEVERE, null, ex);
         return false;
        }
       
    }
      public static void read(){

        try {
            PhaseProgrammeRepository phaseRepo=new PhaseProgrammeRepository(PERSISTENCE_UNIT);
            phaseRepo.findAll();

        } catch (SQLException ex) {
            Logger.getLogger(PhaseProgrammeCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void read(PhaseProgramme phase){
        PhaseProgrammeRepository phaseRepo=new PhaseProgrammeRepository(PERSISTENCE_UNIT);

        try {
            phaseRepo.update(phase);
        } catch (SQLException ex) {
            Logger.getLogger(PhaseProgrammeCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void delete(PhaseProgramme phase){
        PhaseProgrammeRepository phaseRepo=new PhaseProgrammeRepository(PERSISTENCE_UNIT);
        try {
            phaseRepo.delete(phase);
        } catch (SQLException ex) {
            Logger.getLogger(PhaseProgrammeCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
