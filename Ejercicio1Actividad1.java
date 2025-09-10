/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1actividad1;

/**
 *
 * @author Carolina Espinosa Jurado
 */
import java.util.Scanner;

public class Ejercicio1Actividad1 {

    /*
    A la mamá de Juan le preguntan su edad, y contesta: tengo 3 hijos, pregúntele a Juan su
    edad. Alberto tiene 2/3 de la edad de Juan, Ana tiene 4/3 de la edad de Juan y mi edad es
    la suma de las tres. Hacer un algoritmo que muestre la edad de los cuatro.
    */
    
    public static void main(String[] args) {
        //Se utiliza Scanner para leer la edad de Juan desde teclado.
        Scanner scanner = new Scanner(System.in);
        
        // En Java, double es un tipo de dato primitivo que se usa para almacenar números decimales
        System.out.print("Ingrese la edad de Juan: ");
        double edadjuan = scanner.nextDouble();
        double edadalber, edadana, edadmama;
        
        edadalber = (2.0/3.0)* edadjuan;
        edadana = (4.0/3.0)*edadjuan;
        edadmama = edadjuan + edadalber + edadana;
        
        System.out.println("\nLas edades son:");
        System.out.println("Juan: " + edadjuan);
        System.out.println("Alberto: " + edadalber);
        System.out.println("Ana: " + edadana);
        System.out.println("Mama: " + edadmama);
    }
}
