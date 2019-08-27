package com.senati.ejercicio2;

import java.util.Scanner;
public class Ejercicio2 {
			
		public static void main(String[] args) {
			//TODO Auto-generated method stub
			Scanner Leer1 = new Scanner(System.in);
			System.out.print("\n Ingrese el primer numero:   ");
			double n = Leer1.nextDouble();
			Scanner Leer2 = new Scanner(System.in);
			System.out.print("\n Ingrese el segundo numero:  ");
			double m = Leer2.nextDouble();
			System.out.println("X= "+ n +" y Y= "+ m);
			System.out.println("-------------------");
			System.out.println("Cambio de lugar");
			System.out.println("-------------------");
			System.out.println("x= "+ m +" y Y= "+ n);
			
			
		}
}
