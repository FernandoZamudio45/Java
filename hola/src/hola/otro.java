package hola;
import java.util.Scanner;
public class otro {
	 static int funcionalidad1()
	{
		return 1;
	}
	 static int funcionalidad2()
		{
			return 2;
		}
	 public static void main (String[] args) throws Exception
	 {
		int v = funcionalidad1();
		int v2 = funcionalidad2();
		System.out.println(v+" - "+v2);
	 }
}
