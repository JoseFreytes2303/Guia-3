/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia4ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia4ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello World!");
        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();
        if (primo(numero)){
            System.out.println(numero + " es un numero primo");
        } else{
            System.out.println(numero + " no es un numero primo");
        }
    }
    public static boolean primo( int numero){
        if (numero <= 1){
            return false;
        } 
        for (int i = 2; i < Math.sqrt(numero); i++) {
            if (numero % i == 0){
                return false;
            }
        }
    return true;
    }
}
//Crea una aplicación que nos pida un número por teclado y con una
//función se lo pasamos por parámetro para que nos indique si es o no un
//número primo, debe devolver true si es primo, sino false.
//Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
//Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
//17 si es primo.
