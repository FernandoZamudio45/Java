package hola;
import java.util.Random;
import java.util.Scanner;
public class menoramay {
	public static void main(String[] args)
	{
		Random r = new Random ();
		int[] n = new int [100];
	int aux;
		for (int i= 0; i<n.length; i++)
		{
			 int c = r.nextInt(500,1000); 
			n[i] = c;
		}
		System.out.println("Valores sin ordenar:");
		for(int i=0; i<100; i++)
		{
			System.out.println(i+"-"+n[i]);
		}
		System.out.println("");
		for (int i=0; i<100-1; i++)
		{
			for (int j=0; j<(100-1); j++)
			{
				if (n[j]>n[j+1])
				{
					aux = n[j];
					n[j] = n[j+1];
					n[j+1] = aux;
				}
			}
			
		}
		System.out.println("Valores de menor a mayor:");
		for(int i=0; i<100; i++)
		{
			System.out.println(i+"-"+n[i]);
		}
	}
}
