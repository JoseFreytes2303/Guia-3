/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.guia4ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia4ejercicio1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese por favor 2 numeros enteros");
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Ingrese una operacion");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Dividor");
        System.out.println("4 - Multiplicar");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("La suma de los numeros es: " + suma(num, num2));
                int retorno = suma(num, num2);
                break;
            case 2:
                System.out.println("La resta de los numero es: " + resta(num, num2));
                retorno = resta(num, num2);
                break;
            case 3:
                System.out.println("La division de los numeros es : " + dividir(num, num2));
                retorno = dividir(num, num2);
                break;
            case 4:
                System.out.println("La multiplicacion de los numeros es: " + multi(num,num2));
                retorno = multi(num,num2);
                break;
        }

    }

    public static int suma(int num, int num1) {
        int suma;
        suma = num + num1;
        return suma;
    }

    public static int resta(int num, int num1) {
        int resta;
        resta = num - num1;
        return resta;
    }

    public static int dividir(int num, int num1) {
        int dividir;
        dividir = num / num1;
        return dividir;
    }
    public static int multi(int num, int num1){
        int multi;
        multi = num * num1;
        return multi;
    }
}
