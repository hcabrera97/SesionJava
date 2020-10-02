/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rn;

import dao.Datosarchivo;
import estructura.Persona;

/**
 *
 * @author Hernan Cabrera
 */
public class Agenda extends Datosarchivo{
    
    private Persona persona;
    //private Datosarchivo data;
    
    public Agenda(){
        this.persona  = null;
    }
    
    public void insertar(Persona persona){
      this.insertararchivo(persona);
    }
    
    public void actualizar(Persona persona){
        
    }
    
    public void buscar(Persona persona){
        
    }
    
    public void buscar(int telefono){  //Polimorfismo
        
    }
    
    public void buscar(String email){
        
    }
    
    public void buscar(String pn, String sn, String tr, String pa, String sa, String ac){
        
    }
    
    
    
}
