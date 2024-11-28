package hola;
import java.util.Scanner;
public class ejArreglos {
	public static void main(String[] args)
	{
		int[] n = new int [100];
		final int c = 1000; //constante
		for (int i= 0; i<n.length; i++)
		{
			n[i] = i+c;
		}
		for (int i=99; i>=0; i--)
		{
			System.out.println(n[i]);
		}
	}
}
