/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author kim
 */
public class Conexion {
    /**
     * URL de la base de datos local
     */
    public static final String URL= "jdbc:mysql://sql5.freesqldatabase.com:3306/sql5527660";
    /**
     * Usuario de acceso a la base de datos
     */
    public static final String USER= "sql5527660";
    /**
     * Clave de la base de datos 
     */
    public static final String CLAVE= "nEHeaLdiEC";
    
    
    public Connection getConexion(){
        Connection con=null;
        try{
            //Verifica que la clase con la que se realiza la conexion esta instalada             
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Realiza la conexion con la base de datos
            con=(Connection) DriverManager.getConnection(URL, USER, CLAVE);           
            System.out.println("Estado: Se realizo la conexion con exito");
        }catch(Exception e){   
               System.out.println("Estado: No se pudo realizar la conexion");
        }
        return con;
    }
    
    
}
