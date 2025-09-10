/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5actividad1;

/**
 *
 * @author Caro
 */
import java.util.Scanner;
public class Ejercicio5Actividad1 {

    // Dado el radio de un círculo. Haga un algoritmo que obtenga el área del círculo y la longitud de su circunferencia.
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el radio del circulo:");
        double radio = scanner.nextDouble();
        
        double longitud = CalculosEjercicio5.longitud(radio);
        double area = CalculosEjercicio5.area(radio);
        
        System.out.println("\nRadio: " + radio);
        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El area del circulo es: " + area);
    }
}
