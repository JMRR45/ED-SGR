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
public class Día {
    private final DíaDeLaSemana Día;
    private int CapacidadOcupada = 0;
    private ArrayList<Reservación> Reservaciones;

    public Día(DíaDeLaSemana Día) {
        this.Día = Día;
        this.Reservaciones = new ArrayList<Reservación>();
    }

       public void addReservación(Reservación R) {
        this.Reservaciones.add(R);
    }
    
    public DíaDeLaSemana getDía() {
        return Día;
    }

    public void setCapacidadOcupada(int CapacidadOcupada) {
        this.CapacidadOcupada = CapacidadOcupada;
    }

    public int getCapacidadOcupada() {
        return CapacidadOcupada;
    }
    
    
    
}
    
 