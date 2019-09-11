/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Clase: TestControladorExample
 * 
 * @version: 0.1
 *  
 * @since: 9/09/2019
 * 
 * Fecha de Modificación:
 * 
 * @author: Carlos Daniel Escudero Corpas
 * 
 * Copyrigth: CECAR
 */



package edu.cecar.test;

import edu.cecar.controladores.ControladorExample;
import edu.cecar.modelos.Example;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * Clase
 */
public class TestControladorExample {
    
    public static void main(String args[]){
        
        
        
        try {
            Example[] example = ControladorExample.consultarEmpleado();
            
            for(Example e : example){
                System.out.println("date_of_shop: " + e.getDate_of_shop() + " fatal: " + e.getFatal() + " alcohol: " + e.getAlcohol() + " gender: " + e.getGender());
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TestControladorExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

}
