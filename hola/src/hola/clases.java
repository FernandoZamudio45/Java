package hola;

public class clases {
//En las clases locales si se pueden duplicar los nombres de variables ;)
	 static int funcionalidad1()
	{
		 int h = 10;
		return h;
	}
	 static int funcionalidad2()
		{
		 int h = 30;
			return h;
		}
	 public static void main (String[] args) throws Exception
	 {
		int v = funcionalidad1();
		int v2 = funcionalidad2();
		System.out.println(v+" - "+v2);
	 }
}
