package hola;
import java.util.Random;
import java.util.Scanner;
public class adivina {
	public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1; // Número entre 1 y 100
        int intentos = 3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Escoja el número correcto. Tiene: " + intentos + " intentos para adivinarlo.");

        for (int i = 0; i < intentos; i++) {
            System.out.print("Introduzca el número que cree, es correcto: (" + (i + 1) + " de " + intentos + "): ");
            int intento = scanner.nextInt();

            if (intento == numeroSecreto) {
                System.out.println("¡Felicidades! Adivinaste el número.");
                return; // Termina el juego si se adivina el número
            } else if (intento < numeroSecreto) {
                System.out.println("El número es más alto. Intenta de nuevo.");
            } else {
                System.out.println("El número es más bajo. Intenta de nuevo.");
            }
        }

        System.out.println("No adivinaste el número. El número era: " + numeroSecreto);
    }
}
