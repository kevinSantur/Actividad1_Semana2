/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas02;

import java.util.Scanner;
import java.lang.Math;

public class Programa03 {
    public static void main(String[] args) {
        double num, raizCuadrada, potencia;
        Scanner leer = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingresar un número:");
        num = leer.nextDouble();

        // Proceso de datos
        raizCuadrada = Math.sqrt(num);
        potencia = Math.pow(num, 2);

        // Salida de datos
        System.out.println("La raíz cuadrada de " + num + " es: " + raizCuadrada);
        System.out.println(num + " elevado al cuadrado es: " + potencia);
    }
}