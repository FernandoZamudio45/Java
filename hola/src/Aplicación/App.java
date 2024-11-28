package Aplicación;

import Módulos.Leer;

public class App {
    public static void main(String[] args) throws Exception {
    Leer l = new Leer();
    String tex =l.LeerTexto();
    System.out.println(tex);
    System.out.println("Texto escrito: "+tex);
    int n = l.LeerEnt();
    System.out.println("Número entero elegido: "+n);
    }
}
