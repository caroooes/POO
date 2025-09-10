/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3actividad1;

/**
 *
 * @author Carolina Espinosa
 */

import java.util.Scanner;
public class Ejercicio3Actividad1 {

    /* Un empleado trabaja 48 horas en la semana a razón de $5.000 hora. El porcentaje de
    retención en la fuente es del 12,5% del salario bruto. Se desea saber cuál es el salario bruto,
    la retención en la fuente y el salario neto del trabajador.
    */
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Cuantas horas trabaja en la semana: ");
        double horas = scanner.nextDouble();
        System.out.print("Cual es el valor cobrado por hora: ");
        double valor_hora = scanner.nextDouble();
        System.out.print("Cual es el porcentaje de retencion en la fuente: ");
        double porcentaje = scanner.nextDouble();
        
        double salario_bruto = CalculosEjercicio3.salario_bruto(horas, valor_hora);
        double retencion = CalculosEjercicio3.retencion_en_la_fuente(salario_bruto,porcentaje);
        double salario_neto = CalculosEjercicio3.salario_neto(salario_bruto, retencion);
        
        System.out.println("\nEl valor del salario bruto es: " + salario_bruto);
        System.out.println("El valor de la retencion en la fuente es: " + retencion);
        System.out.println("El valor del salario neto es: " + salario_neto);
    }
}
