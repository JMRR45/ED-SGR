/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pf.ed;

/**
 *
 * @author Jean Michel
 */
/*De cada reservación se conoce identificador de cliente, cantidad de personas.*/

public class Reservación {
    private String ClienteID;
    private int CantPersRes;

    public Reservación(String ClienteID, int CantPersRes) {
        this.ClienteID = ClienteID;
        this.CantPersRes = CantPersRes;
    }

    public int getCantPersRes() {
        return CantPersRes;
    }

    public String getClienteID() {
        return ClienteID;
    }

    public void setClienteID(String ClienteID) {
        this.ClienteID = ClienteID;
    }

    public void setCantPersRes(int CantPersRes) {
        this.CantPersRes = CantPersRes;
    }
    
    
    
}
