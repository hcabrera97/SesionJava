/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import estructura.Persona;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hernan Cabrera
 */
public class DatosarchivoTest {
    
    public DatosarchivoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insertararchivo method, of class Datosarchivo.
     */
    @Test
    public void testInsertararchivo() {
        System.out.println("insertararchivo");
        Persona instance = new Persona();
        instance.setAlta(new Date());
        instance.setApellido_casada("");
        instance.setEmail("prueba.java@javasesion.edu.gt");
        instance.setIdfacebook("/Marianajava");
        instance.setIdinstagram("Mariana@java");
        instance.setNacimiento(new Date());
        instance.setOrganizacion("javaseion");
        instance.setPrimer_apellido("Gramajo");
        instance.setPrimer_nombre("Mariana");
        instance.setSegundo_apellido("Grajeda");
        instance.setSegundo_nombre("Gabriela");
        instance.setTelefono(1123456789);
        instance.setTitulo("srta");
        
        Datosarchivo dao = new Datosarchivo();
        dao.insertararchivo(instance);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testInsertararchivo2() {
        System.out.println("insertararchivo");
        Persona instance = new Persona();
        instance.setAlta(new Date());
        instance.setApellido_casada("");
        instance.setEmail("prueba.java@javasesion.edu.gt");
        instance.setIdfacebook("/Marianajava");
        instance.setIdinstagram("Mariana@java");
        instance.setNacimiento(new Date());
        instance.setOrganizacion("javaseion");
        instance.setPrimer_apellido("Gramajo");
        instance.setPrimer_nombre("Mariana");
        instance.setSegundo_apellido("Grajeda");
        instance.setSegundo_nombre("Gabriela");
        instance.setTelefono(1345678900);
        instance.setTitulo("srta");
        
        Datosarchivo dao = new Datosarchivo();
        boolean rest = dao.insertararchivo(instance);
        
        if (rest) assertTrue(rest);
        else  fail("Error");
        // TODO review the generated test code and remove the default call to fail.
        //
    }

    
}
