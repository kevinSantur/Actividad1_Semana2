/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas02;

import java.util.Scanner;
import java.lang.Math;

public class Programa04 {
    public static void main(String[] args) {
        double num, valorAbsoluto, redondeado;
        Scanner leer = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingresar un número decimal:");
        num = leer.nextDouble();

        // Proceso de datos
        valorAbsoluto = Math.abs(num);
        redondeado = Math.round(num);

        // Salida de datos
        System.out.println("El valor absoluto de " + num + " es: " + valorAbsoluto);
        System.out.println(num + " redondeado es: " + redondeado);
    }
}