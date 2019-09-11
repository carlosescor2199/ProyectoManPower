/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Clase: Example
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



package edu.cecar.modelos;

import java.sql.Date;

/**
 *
 * Clase
 */
public class Example {
    
    private String date_of_shop;
    private String fatal;
    private String alcohol;
    private String gender;

    public Example(String date_of_shop, String fatal, String alcohol, String gender) {
        this.date_of_shop = date_of_shop;
        this.fatal = fatal;
        this.alcohol = alcohol;
        this.gender = gender;
    }

    public String getDate_of_shop() {
        return date_of_shop;
    }

    public void setDate_of_shop(String date_of_shop) {
        this.date_of_shop = date_of_shop;
    }

    public String getFatal() {
        return fatal;
    }

    public void setFatal(String fatal) {
        this.fatal = fatal;
    }

    public String getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(String alcohol) {
        this.alcohol = alcohol;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
}
