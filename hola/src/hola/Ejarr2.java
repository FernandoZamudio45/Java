package hola;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejarr2 {
	public static void main(String[] args)
	{
		ArrayList <Integer>ar = new ArrayList ();
		ArrayList <Integer>ar2 = new ArrayList ();
	int[] n = new int [100];
	for (int i= 0; i<n.length; i++)
	{	
		n[i] = i+1;
	}
	for (int i=1; i<=100; i++)
	{
	ar.add(i+100);
	
	}
	for (int valor : n) //Cada valor que se contiene en arreglos.
		ar2.add(valor);
	ar2.addAll(ar);
	System.out.println(ar2);
	}
}
