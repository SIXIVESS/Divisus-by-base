/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import logica.Transferencia;

/**
 * Clase que realiza una consulta a la base de datos y nos devuelve todas las
 * transferencias hechas y por hacer del usuario
 * @author kim
 */
public class consultaTransferencia {
    /**
     * Almacena las id de las transferencias
     */
    public int id[] = new int[2];
    /**
     * Almacena los numeros de cuenta de las transferencias
     */
    public int numCuenta[] = new int[2];
    /**
     * Almacena los motivos de las transferencias
     */
    public String motivo[] = new String[2];
    /**
     * Almacena las fechas de realizacion de las transferencias
     */
    public int fecha[] = new int[2];
    /**
     * Almacena los nombres de los destinatarios de las transferencias
     */
    public String nombreDestinatario[] = new String[2];
    /**
     * Almacena los montos de las transferencias
     */
    public double monto[] = new double[2];

    public void consultarTransferencias() throws SQLException, IOException {
        Conexion con = new Conexion();
        
        /*
        Le indicamos a la base de datos que nos retorne todos los datos 
        almacenados en la tabla de transferencias
        */      
        String query = "select * from transferencia";
        PreparedStatement consulta2 = con.getConexion().prepareStatement(query);
        
        //Consultamos y almacenamos los datos que retorno la base de datos
        ResultSet resultado = consulta2.executeQuery();
        int i = 0;
        while (resultado.next()) {
            this.id[i] = resultado.getInt(1);
            this.numCuenta[i] = resultado.getInt(2);
            this.motivo[i] = resultado.getString(3);
            this.fecha[i] = resultado.getInt(4);
            this.nombreDestinatario[i] = resultado.getString(5);
            this.monto[i] = resultado.getDouble(6);
            i++;
        }
        //Cerramos la conexion con la base de datos
        consulta2.close();
    }

}
