package hola;
import java.util.Scanner;
public class cali {
	public static void main(String[] args)
	{
		byte cal;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calificación: ");
		cal = scan.nextByte();
		if (cal>=70)
		{
			System.out.println("Usted está aprobado con: "+cal);
		}
		else
		{
			System.out.println("Usted ha reprobado con: "+cal);
		}
	}
}
