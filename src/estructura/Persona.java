/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura;

import java.util.Date;

/**
 *
 * @author Hernan Cabrera
 */
public class Persona {
    private int telefono;
    private String email;
    private String idfacebook; 
    private String idinstagram; 
    private String primer_nombre;
    private String segundo_nombre;
    private String tercer_nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private String apellido_casada;
    private Date nacimiento; 
    private String organizacion; 
    private String titulo;
    private Date alta;
    
    public Persona(){
        this.telefono = 0;
        this.email = "";
        this.idfacebook = "";
        this.idinstagram = "";
        this.primer_nombre = "";
        this.segundo_nombre = "";
        this.tercer_nombre = "";
        this.primer_apellido = "";
        this.segundo_apellido = "";
        this.apellido_casada = "";
        this.nacimiento = new Date();
        this.organizacion = "";
        this.titulo = "";
        this.alta =  new Date();
    }
    
    
    public String registro(){
        return Integer.toString(this.telefono)+"#"+this.email+"#"+this.idfacebook+"#"+
                this.primer_nombre+"#"+this.segundo_nombre+"#"+this.tercer_nombre+"#"+
                this.primer_apellido+"#"+this.segundo_apellido+"#"+this.apellido_casada+"#"+
                this.nacimiento.toString()+"#"+this.organizacion+"#"+this.titulo+"#"+
                this.alta.toString()+"\n";
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return this.telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        
        if (email.length()==0) this.email="-----";
        else 
            this.email = email;
    }

    /**
     * @return the idfacebook
     */
    public String getIdfacebook() {
        return this.idfacebook;
    }

    /**
     * @param idfacebook the idfacebook to set
     */
    public void setIdfacebook(String idfacebook) {
        this.idfacebook = idfacebook;
    }

    /**
     * @return the idinstagram
     */
    public String getIdinstagram() {
        return this.idinstagram;
    }

    /**
     * @param idinstagram the idinstagram to set
     */
    public void setIdinstagram(String idinstagram) {
        this.idinstagram = idinstagram;
    }

    /**
     * @return the primer_nombre
     */
    public String getPrimer_nombre() {
        return this.primer_nombre;
    }

    /**
     * @param primer_nombre the primer_nombre to set
     */
    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    /**
     * @return the segundo_nombre
     */
    public String getSegundo_nombre() {
        return this.segundo_nombre;
    }

    /**
     * @param segundo_nombre the segundo_nombre to set
     */
    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    /**
     * @return the tercer_nombre
     */
    public String getTercer_nombre() {
        return this.tercer_nombre;
    }

    /**
     * @param tercer_nombre the tercer_nombre to set
     */
    public void setTercer_nombre(String tercer_nombre) {
        this.tercer_nombre = tercer_nombre;
    }

    /**
     * @return the primer_apellido
     */
    public String getPrimer_apellido() {
        return this.primer_apellido;
    }

    /**
     * @param primer_apellido the primer_apellido to set
     */
    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    /**
     * @return the segundo_apellido
     */
    public String getSegundo_apellido() {
        return this.segundo_apellido;
    }

    /**
     * @param segundo_apellido the segundo_apellido to set
     */
    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    /**
     * @return the apellido_casada
     */
    public String getApellido_casada() {
        return this.apellido_casada;
    }

    /**
     * @param apellido_casada the apellido_casada to set
     */
    public void setApellido_casada(String apellido_casada) {
        this.apellido_casada = apellido_casada;
    }

    /**
     * @return the nacimiento
     */
    public Date getNacimiento() {
        return this.nacimiento;
    }

    /**
     * @param nacimiento the nacimiento to set
     */
    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    /**
     * @return the organizacion
     */
    public String getOrganizacion() {
        return this.organizacion;
    }

    /**
     * @param organizacion the organizacion to set
     */
    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the alta
     */
    public Date getAlta() {
        return this.alta;
    }

    /**
     * @param alta the alta to set
     */
    public void setAlta(Date alta) {
        this.alta = alta;
    }
    
        
}
