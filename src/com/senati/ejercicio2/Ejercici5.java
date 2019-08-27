package com.senati.ejercicio2;

import java.util.Scanner;
public class Ejercici5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int sueldobruto;
			int sueldoneto;
			double descuento1= 0.10;
			double descuento2= 0.05;
			double descuento3= 0.03;
			
			
			
			Scanner sueldo = new Scanner(System.in);
			System.out.print("\n Ingrese su sueldo:  ");
			double n = sueldo.nextDouble();
			System.out.println("Se le hara tres descuentos");
			System.out.println("Gobierno= 10%");
			System.out.println("Seguro= 5%");
			System.out.println("Donación= 3%");
			System.out.println("Primer descuento: "+descuento1*n);
			System.out.println("Segundo descuento: "+descuento2*n);
			System.out.println("Tercer descuento: "+descuento3*n);
			double n1 = n*descuento1;
			double n2 = n*descuento2;
			double n3 = n*descuento3;
			System.out.println("El sueldo es: "+(n-(n1+n2+n3)));
	}

}
