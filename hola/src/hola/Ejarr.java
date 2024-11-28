package hola;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class Ejarr {
public static void main (String[] args)
{
	Scanner s = new Scanner (System.in);
	ArrayList<Integer> n = new ArrayList();
	HashSet<Integer> nd = new HashSet(); // Sirve para evitar duplicados
	int sum = 0;
int num = 0;
System.out.println("Ingrese números enteros (ingrese uno negativo para terminar): ");
	while (num>=0)
	{
		
		num = s.nextInt();
		
		if (nd.add(num))
		{
			n.add(num);
			sum += num;
		} //suma el número sólo si no se repite
		else
		{
			System.out.println("El número "+num+" ya se registró, ingrese otro.");
		}
	}
		System.out.println("Suma de todos los números registrados: "+sum);
}
}
