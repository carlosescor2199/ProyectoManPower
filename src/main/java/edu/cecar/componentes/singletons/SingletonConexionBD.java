/**
 * Clase: $(name)
 * 
 * @version: 0.1
 *  
 * @since: $(date)
 * 
 * Fecha de Modificación:
 * 
 * @author: Carlos Daniel Escudero Corpas
 * 
 * Copyrigth: CECAR
 */



package edu.cecar.componentes.singletons;

import edu.cecar.componentes.basesDeDatos.ConectarMySQL;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * Singleton que devuelve la conexión a una Base de Datos
 */
public class SingletonConexionBD {
    
    //Lazy
    private static Connection connection;
    
    //Eager
    //private static Connection connection1 = new ConectarMySQL(null, null, null, null).getConnection();
    
    //Lazy
    public static Connection getInstance(){
        if(connection == null){
            
            try {
                Properties properties = new Properties();
                properties.load(new FileInputStream("recursos/Conexion.properties"));
                
                connection = new ConectarMySQL(properties.getProperty("host"), properties.getProperty("baseDatos"), properties.getProperty("port"),
                        properties.getProperty("usuario"), properties.getProperty("password")).getConnection();
            } catch (IOException ex) {
                Logger.getLogger(SingletonConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return connection;
    }
    
    //Eager
    /*public Connection getInstance1(){
        return connection;
    }*/
}
