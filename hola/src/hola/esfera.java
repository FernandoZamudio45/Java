package hola;
import java.util.Scanner;
public class esfera {
	public static void main(String[] args)
	{
		
		Scanner n = new Scanner (System.in);
		System.out.println("Introduzca el valor del radio: ");
		double n2 = n.nextDouble();
		double t = calc(n2);
		System.out.println("Volumen de la esfera: "+t);
	}
     static double calc ( double n2)
	{
    	 double pi = 3.1416;
    	 double tot;
		return tot = (4*pi*Math.pow(n2, 3))/3;
		//Math.pow sirve para elevar a una potencia; el primer espacio es la base y el segundo es la potencia
	}
	}
