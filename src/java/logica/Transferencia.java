/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;


/**
 * Clase que almacena los datos de una transferencia
 * @author kim
 */
public class Transferencia {
    /**
     * Almacena el monto de la transferencia
     */
    public double monto;
    /**
     * Almacena el nombre del destinatario
     */
    public String nombreDestinatario;
    /**
     * Almacena el id de la transferencia
     */
    public int id;
    /**
     * Almacena el motivo de la transferencia
     */
    public String motivo;
    /**
     * Almacena el numero de cuenta que realizo la trasferencia
     */
    public int num_Cuenta;
    /**
     * 
     */
    public int fecha;

    public Transferencia(double monto, String nombreDestinatario, int id, String motivo, int num_Cuenta, int fecha) {
        this.monto = monto;
        this.nombreDestinatario = nombreDestinatario;
        this.id = id;
        this.motivo = motivo;
        this.num_Cuenta = num_Cuenta;
        this.fecha=fecha;
    }

    public double getMonto() {
        return monto;
    }

    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    public int getId() {
        return id;
    }

    public String getMotivo() {
        return motivo;
    }

    public int getNum_Cuenta() {
        return num_Cuenta;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setNombreDestinatario(String nombreDestinatario) {
        this.nombreDestinatario = nombreDestinatario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setNum_Cuenta(int num_Cuenta) {
        this.num_Cuenta = num_Cuenta;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }    
    
    @Override
    public String toString() {
        return this.nombreDestinatario;
    }

}
