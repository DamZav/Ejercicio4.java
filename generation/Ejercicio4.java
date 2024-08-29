package com.generation;

import java.util.Scanner;

// ===== CAMBIOS =====
//Hacer el main
//importar Scanner
//Agregar systemIn al scanner
//cerrar la llave para el switch piedra

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    
		// Jugador 1
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    
	    //Jugador 2
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	    String j2 = s.nextLine();
	    
	    if (j1 == j2) {
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      
	      // Switch de los posibles casos
	      switch(j1) {
	        case "piedra":
	          if (j2 == "tijeras") {
	            g = 1;
	          }

	        case "papel":
	          if (j2 == "piedra") {
	            g = 1;
	          }
	          
	        case "tijera":
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	        default:
	      }
	      System.out.println("Gana el jugador " + g);
	    }
	} 
  
}