import java.util.HashSet;
public class oparreglos {
    public static int suma(int[] arr)
    {
        int s = 0;
        for (int v : arr)
        {
s += v;
        }
        return s;
    }
    public static int vu (Object[] arr)
    {
        //HashSet para almacenar valores únicos
HashSet<Object>set = new HashSet<>();
for (Object obj : arr)
{
    set.add(obj); //el Hashset elimina duplicados
}
        return set.size(); //Indica el número de elementos únicos
    }

    public static void main(String[] args) {
       
    }
}
