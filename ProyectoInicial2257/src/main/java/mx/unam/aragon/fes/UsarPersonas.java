/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.fes;

/**
 *
 * @author Mmontse Garcia 
 */
public class UsarPersonas {
    public static void main(String[] args) {
        System.out.println("Programa usar persona");     
        Personas per1= new Personas();   //llamada al constructor
        Personas per2= new Personas();
        
        System.out.println(per1.getNombre());
        
        per2.setNombre("Montse");
        System.out.println(per2.getNombre());
        
        System.out.println(per2.toString());
        per2.setEdad(18);
        System.out.println(per2.toString());
    }
}
