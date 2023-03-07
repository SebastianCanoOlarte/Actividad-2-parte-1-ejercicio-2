/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2parte1ejercicionumero2;

import java.util.Scanner;
public class Actividad2Parte1EjercicioNumero2 {

    public static void main(String[] args) {
       int lado,perimetro;
       double altura,area;
       Scanner leer = new Scanner(System.in);
       System.out.println("ingrese el lado de un tirangulo equilatero");
       lado = leer.nextInt();
       perimetro = 3*lado;
       altura = (Math.sqrt(3)*lado)/2;
       area = (Math.pow(lado, 2)*Math.sqrt(3))/4;
       System.out.println("el triangulo equilatero con lado "+lado+" tiene un perimetro de "+perimetro);
       System.out.println("Una altura de "+altura);
       System.out.println( "Y un area de "+area);
    }
}
