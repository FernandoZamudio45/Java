package hola;
import java.util.Arrays;
import java.util.Scanner;
public class Arraysmetod {
	public static void main(String[] args)
	{
		byte[] a = {1, 3, 4};
		byte c[] = Arrays.copyOf(a, 3); //Método para copiar el array original
		System.out.println("Original: "+Arrays.toString(a));
		System.out.println("Copia: "+Arrays.toString(c));
		
	}
}

