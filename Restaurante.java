/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pf.ed;
import java.util.ArrayList;

/**
 *
 * @author Jean Michel
 */

/*De cada restaurante se conoce su identificador, nombre y capacidad diaria.*/

public class Restaurante {
   private String RestauranteID;
   private String Nombre;
   private int Capacidad;
   private ArrayList <Día> Semana;
   

    public Restaurante(String RestauranteID, String Nombre, int Capacidad) {
        this.RestauranteID = RestauranteID;
        this.Nombre = Nombre;
        this.Capacidad = Capacidad;
        this.Semana = new ArrayList<Día>();
        
        
    }
    
    public void addReservación(String D, Reservación R){
        int i =0;
        boolean added = false;
        
        while (!false & i<7){
            if(Semana.get(i).getDía().equals(D)){
                Semana.get(i).addReservación(R);
                added = true;
            }
        }
    }

    public ArrayList<Día> getSemana() {
        return Semana;
    }

 
    public String getRestauranteID() {
        return RestauranteID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setRestauranteID(String RestauranteID) {
        this.RestauranteID = RestauranteID;
    }


    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }
    
    public int getCapacidad(String D){
    int CapDisp = 0, i = 0;
    boolean founded = false;
    
       while(!founded & i<Semana.size()){
            if(Semana.get(i).getDía().equals(D)){  
                CapDisp = this.Capacidad - Semana.get(i).getCapacidadOcupada();
            }else
                i++;
        }
    return CapDisp;
    }
    
    public int getDíaAlt( int CantPersRes){
    int CapDisp = 0, i = 0;
    boolean founded = false;
    
        while(!founded & i<Semana.size()){
            if(Semana.get(i).getCapacidadOcupada() + CantPersRes <= this.Capacidad){  
                founded = true;
            }else
                i++;
        }
        if (!founded){
        i = -1;}
            
        return i;
    }
}
