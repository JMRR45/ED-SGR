/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pf.ed;

/**
 *
 * @author Jean Michel
 */
/*De cada solicitud se conoce, su identificador, identificador del cliente, nombre del cliente,
cantidad de personas a reservar y número de teléfono, nombre del restaurante y día de la semana en que se quiere reservar. */

public class Solicitud {
    private String ID;
    private String ClienteID;
    private int CantPersRes;
    private String NumTel;
    private String NombRest;
    private String DíaDeLaSemana;

    public Solicitud(String ID, String ClienteID, int CantPersRes, String NumTel, String NombRest, String DíaDeLaSemana) {
        this.ID = ID;
        this.ClienteID = ClienteID;
        this.CantPersRes = CantPersRes;
        this.NumTel = NumTel;
        this.NombRest = NombRest;
        this.DíaDeLaSemana = DíaDeLaSemana;
    }
 

    public void setCantPersRes(int CantPersRes) {
        this.CantPersRes = CantPersRes;
    }

    public void setDía(String Día) {
        this.DíaDeLaSemana = Día;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getCantPersRes() {
        return CantPersRes;
    }

    public String getClienteID() {
        return ClienteID;
    }

    public String getNombRest() {
        return NombRest;
    }

    public String getNumTel() {
        return NumTel;
    }

    public void setClienteID(String ClienteID) {
        this.ClienteID = ClienteID;
    }

    public void setNombRest(String NombRest) {
        this.NombRest = NombRest;
    }

    public void setNumTel(String NumTel) {
        this.NumTel = NumTel;
    }  

    public String getDíaDeLaSemana() {
        return DíaDeLaSemana;
    }

    public String getID() {
        return ID;
    }
    
    
    
}
