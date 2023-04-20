/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia4ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia4ejercicio2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        datos();
    }
    public static void datos(){
        Scanner sc = new Scanner(System.in);
        String respuesta = "SI";
        String nombre;
        int edad;
        System.out.println("Ingrese la cantidad de personas");
        int personas = sc.nextInt();
        sc.nextLine();
        do {
            for (int i = 0; i < personas; i++){
            System.out.println("Ingrese el nombre de la persona "+ (i+1) + ":");
            nombre = sc.nextLine();
            System.out.println("Ingrese la edad de las personas " + (i+1) + ":");
            edad = sc.nextInt(); 
            sc.nextLine();
             if (edad >= 18){
                 System.out.println("Mayor de edad");
            } else {
                 System.out.println("Menor de edad");
             }
             if (i < personas){
                 System.out.println("Desea seguir mostrando personas? Si o NO");
                 respuesta = sc.nextLine();
                 if(!respuesta.equalsIgnoreCase("Si")){
                     break;
                 }
             }
        }
            
        } while (respuesta.equalsIgnoreCase("Si"));
        sc.close();
        
        
    }
}
