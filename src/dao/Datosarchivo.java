/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import estructura.Persona;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hernan Cabrera
 */
public class Datosarchivo {
    
    private List<Persona> listado;
    private FileOutputStream fos;
    
    public Datosarchivo() {
        try {
            this.fos = new FileOutputStream("C:\\temp\\agend.dat");
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(Datosarchivo.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se encuentra el archivo, debe de estar en la unidad C y el directorio temp \n el nombre del archivo debe de ser agenda.dat");
            this.fos = null;
        }
    }
    
    public boolean insertararchivo(Persona persona){
        if (this.fos != null){
            byte[] registro = persona.registro().getBytes();

            try {
                fos.write(registro);
                return true;
            } catch (IOException ex) {
                //Logger.getLogger(Datosarchivo.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("No fue posible realizar la grabación.");
                return false;
            }
        }
        else {
            System.out.println("Medio de almacenamiento no abierto");
            return false;
        }
        
    }
    
    public void cerrar() throws IOException{
        if (this.fos != null) this.fos.close();
    }
    
    public void actualizararchivo(Persona actual, Persona nuevadata){
        
    }
    
    public void borrararchivo(Persona persona){
        
    }
    
    public void buscararchivo(Persona personabusqueda){
        
    }
    
    public void listar(){
        
    }
    
}
