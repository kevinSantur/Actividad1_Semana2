/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas02;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
public class Programa02 {
    public static void main(String[] args){
      //declarar las variables
      double radio,acirculo;
      Scanner lectura=new Scanner(System.in);
      DecimalFormat formato=new DecimalFormat("##.##");
      //entrada de datos
      System.out.print("Ingresar el radio del circulo:");
      radio=lectura.nextDouble();
      //proceso de datos
      acirculo=Math.PI*Math.pow(radio,2);
      //salida de datos
      System.out.print("El area del circulo es:"+formato.format(acirculo));
    }
}
