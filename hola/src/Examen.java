import java.util.Scanner;
public class Examen{
public static void main(String[] args) {
    int s = 0;
    for (int i = 1; i <= 30; i++) {
        s += i; 
    }
    System.out.println("La suma de los primeros 30 números naturales es: " + s);
}
}