package hola;
import java.util.Scanner;
public class GaF {
	public static void main(String[] args)
	{
		Scanner n = new Scanner (System.in);
		System.out.println("Introduzca los grados a centígrados a transformar: ");
		double n2 = n.nextDouble();
		double t = calc(n2);
		System.out.println("Grados centígrados: "+n2+" Farenheit: "+t);
	}
     static double calc ( double n2)
	{
    	 double tot;
		return tot = 32 + (9*n2/5);
	}
}
