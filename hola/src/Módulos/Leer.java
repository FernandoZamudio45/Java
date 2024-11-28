package Módulos;

import java.util.Scanner;

public class Leer {
    Scanner scn;
    //Constructor
    public Leer()
    {
        scn = new Scanner(System.in);
    }
   public  String LeerTexto()
    {
        
return scn.nextLine();
    }
public  int LeerEnt()
{
return scn.nextInt();
}
public  double LeerDec()
{
return scn.nextDouble();
}
}
