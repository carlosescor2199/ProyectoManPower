/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Clase: ControladorExample
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



package edu.cecar.controladores;

import edu.cecar.componentes.singletons.SingletonConexionBD;
import edu.cecar.modelos.Example;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * Clase
 */
public class ControladorExample {
    
    private static int numRegistros() throws SQLException{
        PreparedStatement ps = SingletonConexionBD.getInstance().prepareStatement("select count(1) from examples");
        
        ResultSet resultSet = ps.executeQuery();
        resultSet.next();
        int tamaño = resultSet.getInt(1);
        resultSet.close();
        return tamaño;
    }
    
    public static Example[] consultarEmpleado() throws SQLException{
        
        int tamaño = numRegistros();
        
        Example[] registros = new Example[20];
        
        PreparedStatement ps = SingletonConexionBD.getInstance().prepareStatement(""
                + "select * from examples limit 20");
        
        ResultSet resultSet = ps.executeQuery();
        int i = 0;
        while(resultSet.next()){
            Example example = new Example(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4));
            registros[i] = example;
            i++;
        }
        
               
        
        return registros;
    }

}
