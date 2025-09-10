/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4actividad1;

/**
 *
 * @author Carolina Espinosa
 */

import java.util.Scanner;
public class Ejercicio4Actividad1 {
    
    // Elabore un algoritmo que lea un número y obtenga su cuadrado y su cubo

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un numero:");
        double numero = scanner.nextDouble();
        
        double cuadrado = CalculosEjercicio4.cuadrado(numero);
        double cubo = CalculosEjercicio4.cubo(numero);
        
        System.out.println("Numero: " + numero);
        System.out.println("El cuadrado del numero ingresado es " + cuadrado);
        System.out.println("El cubo del numero ingresado es " + cubo);
    }
}
