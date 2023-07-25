/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pf.ed;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


/**
 *
 * @author Jean Michel
 */
public class SistemaGestor {
    private Queue <Solicitud> Solicitudes;
    private Queue <SolicitudE> SolicitudesEnEspera;
    private ArrayList<Restaurante>Restaurantes;
    
    

    public SistemaGestor() {
        this.Solicitudes = new LinkedList <Solicitud>();
        this.SolicitudesEnEspera =  new LinkedList <SolicitudE>();
        this.Restaurantes = new ArrayList <Restaurante>();
    }
    
    
    
    public boolean ProcesarSolicitud (){
        
     boolean éxito = false;
     int i=0;
     
      while(!éxito & !Solicitudes.isEmpty()){
        if(Solicitudes.peek().getNombRest().equals(Restaurantes.get(i).getNombre())){
            if(Restaurantes.get(i).getCapacidad(Solicitudes.peek().getDíaDeLaSemana()) >= Solicitudes.peek().getCantPersRes()){
               Reservación R1 = new Reservación(Solicitudes.peek().getClienteID(), Solicitudes.peek().getCantPersRes());
               Restaurantes.get(i).addReservación(Solicitudes.peek().getDíaDeLaSemana(), R1);
               éxito = true;}
            else if(Restaurantes.get(i).getDíaAlt(Solicitudes.peek().getCantPersRes())!= -1){
                    Reservación R2 = new Reservación(Solicitudes.peek().getClienteID(), Solicitudes.peek().getCantPersRes());
                    Restaurantes.get(i).addReservación(Restaurantes.get(i).getSemana().get(Restaurantes.get(i).getDíaAlt(Solicitudes.peek().getCantPersRes())).getDía().toString(), R2);
                     éxito = true;
                }
                    
        }else
            i++;
      }
      
    if(!éxito){
    SolicitudE SR1 = new SolicitudE(Solicitudes.peek().getID(), Solicitudes.peek().getClienteID(), Restaurantes.get(i).getRestauranteID(),Solicitudes.peek().getCantPersRes(), Restaurantes.get(i).getDíaAlt(i))
            
                
        
            
            
               
     
    }
    
    
    
}
