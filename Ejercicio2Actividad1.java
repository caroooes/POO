/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2actividad1;

/**
 *
 * @author Carolina Espinosa Jurado
 */

import java.util.Scanner;

public class Ejercicio2Actividad1 {

    /* Hacer un seguimiento (prueba de escritorio) del siguiente grupo de instrucciones.
    INICIO
    SUMA = 0
    X = 20
    SUMA = SUMA + X
    Y = 40
    X = X + Y ** 2
    SUMA = SUMA + X / Y
    ESCRIBA: “EL VALOR DE LA SUMA ES:”, SUMA
    FIN_INICIO
    */
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un valor para 'suma': ");
        double suma = scanner.nextDouble();
        System.out.print("Ingrese un valor para 'X': ");
        double X = scanner.nextDouble();
        System.out.print("Ingrese un valor para 'Y': ");
        double Y = scanner.nextDouble();
        
        suma = CálculosEjercicio2.calcular_suma(suma, X);
        X = CálculosEjercicio2.calcular_X(X, Y);
        suma = suma + (X/Y);
        
        System.out.println("\nEl valor de la suma es: " + suma);
    }
}
