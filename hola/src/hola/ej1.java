package hola;

import java.util.Scanner;

public class ej1 {
public static void main(String[] args)
{
	byte n1;
	byte n2;
	int sum;
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Escribe el número 1: ");
	n1 = scan.nextByte();
	System.out.println("Escribe el número 2: ");
	n2 = scan.nextByte();
	sum = n1+n2;
	System.out.println("La suma es: "+sum);
	
}
}
