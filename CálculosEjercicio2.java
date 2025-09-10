/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2actividad1;

public class CálculosEjercicio2 {
    /* Static double es una declaración de un método o una variable estática de tipo decimal (double), es decir, 
       un número de punto flotante de doble precisión que pertenece a la clase y no a una instancia (objeto).
    */
    static double calcular_suma(double suma, double X){
        suma = suma + X;
        return suma;
    }
    
    static double calcular_X(double X, double Y){
        double x = X + Math.pow(Y, 2);
        return x;
    }
    
}
