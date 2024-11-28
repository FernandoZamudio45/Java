package hola;
import java.util.Scanner;
public class breeak {
	public static void main(String[] args)
	{
		for (int x=1; x<=10; x++)
		{
			for (int y=x; y<=10; y++)
			{
				System.out.println("X: "+x+" Y: "+y);
				if (y==5)
				{
					break;
				}
			}
			
			}
	}
}
