/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas02;
import java.util.Scanner;
import java.lang.Math;

public class Programa01 {
    //metodo de la clase
    public static void main(String[] args) {
        int num1,num2,maximo,minimo;
        Scanner leer=new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar número 1:");
        num1=leer.nextInt();
        System.out.print("Ingresar número 2:");
        num2=leer.nextInt();
        //proceso de datos
        maximo=Math.max(num1, num2);
        minimo=Math.min(num2, num2);
        //salida de datos
        System.out.println("El maximo numero es:"+maximo);
        System.out.println("El minimo numero es:"+minimo);  
        
    } 
}
