package hola;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	 public static void main(String[] args) throws Exception {
	           // Character character = ApiUtil.getCharacterById(2);
	            //System.out.println("Nombre: " + character.name);
	            //System.out.println("Estado: " + character.status);
	           // System.out.println("Capítulos: " + ""+character.episode.size());
	           
	            // Imprimir más datos según sea necesario
	    int co =0;
	    char caracter;
	            Character p = new Character ();
	            p.name = "Jotaro";
	            Character p2 = new Character ();
	            p2.name = "Dio";
	            Character p3 = new Character ();
	            p3.name = "Jonathan";
	            Character p4 = new Character ();
	            p4.name = "Caesar";
	            Character p5 = new Character ();
	            p5.name = "Joseph";
	            Character[] pe = {p,p2,p3,p4,p5};
	            for (int x = 0; x<pe.length; x++)
	            {
	            	if (pe[x].name.endsWith("o"))//los que terminan en o minúscula.
	            		//el Contains es para los que contienen ciertas palabras.
	            	{
	            		//System.out.println(pe[x].name);
	            		
	            	}
	            	
	            	}
//	            for (int x = 0; x<pe.length; x++)
//	            {
//	            	System.out.println(pe[x].name);
//	            	System.out.println(pe[x].name.length());
//	            	for (int y =0; y<pe[y].name.length(); y++)
//	            	{
//	            		caracter = pe[x].name.charAt(y);
//	            	if (caracter == 'a' || caracter == 'e'
//	            			|| caracter == 'i' || caracter == 'o'
//	            			|| caracter == 'u')
//	            	{
//	            		co++;
//	            	}
//	            	
//	            	}
//	            }
//	            System.out.println("Vocales: "+co);
//	            }
//	           }
	            Object[] ar = {1, 20.3, "hola", 3.4f, true};
	            for (Object o : ar)
	            {
	            	System.out.println(o.getClass().getSimpleName());
	            }
	 }
}



