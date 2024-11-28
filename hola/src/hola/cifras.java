package hola;
import java.util.Scanner;
public class cifras {
	public static void main(String[] args)
	{
		System.out.println("Introduzca algún número entero positivo: ");
		Scanner n = new Scanner(System.in);
		int n2 = n.nextInt();
		int c = cif(n2);
		System.out.println("El número "+n2+" tiene "+c+" cifras");
	}
	public static int cif (int n)
	{
		return String.valueOf(Math.abs(n)).length();
	}
}
