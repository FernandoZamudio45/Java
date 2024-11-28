package hola;
import java.util.Scanner;
public class mayor {
	public static void main(String[] args)
	{
		Scanner n = new Scanner (System.in);
		int may=0;
		for (int i=1; i<=3; i++)
		{
			System.out.println("Escriba un número: ");
			int n2 = n.nextInt();
			if (n2>may)
			{
				may = n2;
			}
		}
		System.out.println("El número mayor es: "+may);
	}
}
