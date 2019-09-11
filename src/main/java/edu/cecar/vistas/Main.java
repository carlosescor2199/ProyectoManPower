/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Clase: Main
 * 
 * @version: 0.1
 *  
 * @since: 2/09/2019
 * 
 * Fecha de Modificación:
 * 
 * @author: Carlos Daniel Escudero Corpas
 * 
 * Copyrigth: CECAR
 */



package edu.cecar.vistas;

import edu.cecar.controladores.ControladorExample;
import edu.cecar.modelos.Example;
import java.sql.SQLException;

/**
 *
 * Clase
 */
public class Main {
    
    public static void main(String[] args) throws SQLException {
        
        Example[] example = ControladorExample.consultarEmpleado();
        
        for(Example examples : example){
            System.out.println(examples.getDate_of_shop()+" "+examples.getAlcohol()+" "+examples.getFatal()+" "+examples.getGender());
        }
        
    }

}
