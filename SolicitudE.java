/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pf.ed;

/**
 *
 * @author Jean Michel
 */

/*De cada solicitud en
espera se conoce, identificador de la solicitud original, identificador del cliente,
identificador del restaurante, cantidad de personas a reservar y día de la semana que se
ofertó como alternativa. 
*/
public class SolicitudE {
   private String SolicitudOID;
   private String ClienteID;
   private String RestauranteID;
   private int CantPersRes;
   private String DíaAlt;

    public SolicitudE(String SolicitudOID, String ClienteID, String RestauranteID, int CantPersRes, String DíaAlt) {
        this.SolicitudOID = SolicitudOID;
        this.ClienteID = ClienteID;
        this.RestauranteID = RestauranteID;
        this.CantPersRes = CantPersRes;
        this.DíaAlt = DíaAlt;
    }

    public int getCantPersRes() {
        return CantPersRes;
    }

    public String getClienteID() {
        return ClienteID;
    }

    public String getDíaAlt() {
        return DíaAlt;
    }

    public String getRestauranteID() {
        return RestauranteID;
    }

    public String getSolicitudOID() {
        return SolicitudOID;
    }

    public void setCantPersRes(int CantPersRes) {
        this.CantPersRes = CantPersRes;
    }

    public void setClienteID(String ClienteID) {
        this.ClienteID = ClienteID;
    }

    public void setDíaAlt(String DíaAlt) {
        this.DíaAlt = DíaAlt;
    }

    public void setRestauranteID(String RestauranteID) {
        this.RestauranteID = RestauranteID;
    }

    public void setSolicitudOID(String SolicitudOID) {
        this.SolicitudOID = SolicitudOID;
    }
   
   
    
}
