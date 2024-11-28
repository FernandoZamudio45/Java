package hola;
import java.util.Scanner;
public class flecha {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de asteriscos para la flecha: ");
        int n = scanner.nextInt();

        // Dibuja la flecha
        if (n < 3) {
        	System.out.println("El número tiene que ser mayor que 3");;
            // Parte superior de la flecha
        }
        	else {
            for (int i = 0; i < n/2; i++) {
            for (int o = 0; o < i; o++) {
                System.out.print("  "); // Espacios para la parte de la flecha
       
            }
            System.out.print("*"); // El cuerpo de la flecha
            System.out.println();
            }
            // Parte inferior de la flecha
            for (int i = n/2; i >= 0; i--) {
            	for (int j = 0; j < i; j++) {
            		System.out.print("  ");
                }
            	 
            	 System.out.print("*");
            	 System.out.println();
            }
        
        	}
        }
        }
	