package hola;

public class matr {
	public static void main(String[] args)
	{
	int[][]tm = new int [101][101];
	for (int i=1; i<=100; i++) {
		for (int j=1; j<=100; j++){
		tm[i][j] = i*j;
		}
	}
	System.out.println("    ");
	for (int i=0; i<=100; i++) {
		System.out.printf("%6d", i);		
	}
	System.out.println("");
	for (int i=0; i<=100; i++) {
		System.out.printf("%6d", i);
		for (int j=1; j<=100; j++) {
		System.out.printf("%6d", tm[i][j]);				
		}
		System.out.println("");
	}
	}
}
