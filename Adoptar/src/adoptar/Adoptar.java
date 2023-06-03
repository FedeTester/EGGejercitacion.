/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adoptar;

import entidades.Perro;
import anda.Persona;


public class Adoptar {


    public static void main(String[] args) {
        Perro D1 = new Perro("Pipo", "Dogo", 10 , "Mediano");
        Perro D2 = new Perro("Duco", "Callejero", 2 , "Grande");       
      
        Persona P1 = new Persona("Luis", "Marquez", 28, "12.132.514", D1);
        
        Persona P2 = new Persona ("Marcos", "Lopez", 45, "10.132.514", D2);
        
        System.out.println(P1.toString());
        System.out.println(P2.toString());
  
    }

}
