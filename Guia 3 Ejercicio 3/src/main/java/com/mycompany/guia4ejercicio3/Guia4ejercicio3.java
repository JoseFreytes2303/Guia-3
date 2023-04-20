/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.guia4ejercicio3;


import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia4ejercicio3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        convertir();
    }

    public static void convertir() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Euros que desea convertir");
        double euros = sc.nextDouble();
        sc.nextLine();
        System.out.println(("Ingrese a qué moneda desea convertir (USD, LIBRAS o YENES):"));
        String moneda = sc.nextLine();
        double cambio;
        switch (moneda.toUpperCase()) {
            case "USD":
                cambio = euros * 1.28611;
                System.out.println(euros + " euros son " + cambio + " dólares.");
                break;
            case "LIBRAS":
                cambio = euros * 0.86;
                System.out.println(euros + " euros son " + cambio + " libras.");
                break;
            case "YENES":
                cambio = euros * 129.852;
                System.out.println(euros + " euros son " + cambio + " yenes.");
                break;
            default:
                System.out.println("Moneda no valida");
                break;

        }

    }
}
