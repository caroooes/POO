/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3actividad1;

public class CalculosEjercicio3 {
    static double salario_bruto (double horas, double valor_hora){
        double salario_bruto = horas*valor_hora;
        return salario_bruto;
    }
    
    static double retencion_en_la_fuente (double salario_bruto, double porcentaje){
        double retencion = salario_bruto*(porcentaje/100);
        return retencion;
    }
    
    static double salario_neto (double salario_bruto, double retencion){
        double salario_neto = salario_bruto - retencion;
        return salario_neto;
    }
}
