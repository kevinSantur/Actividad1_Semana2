/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas02;

import java.util.Scanner;
import java.lang.Math;

public class Programa05 {
    public static void main(String[] args) {
        double angulo, seno, coseno;
        Scanner leer = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingresar un ángulo en grados:");
        angulo = leer.nextDouble();

        // Convertir grados a radianes
        double anguloRadianes = Math.toRadians(angulo);

        // Proceso de datos
        seno = Math.sin(anguloRadianes);
        coseno = Math.cos(anguloRadianes);

        // Salida de datos
        System.out.println("El seno de " + angulo + " grados es: " + seno);
        System.out.println("El coseno de " + angulo + " grados es: " + coseno);
    }
}