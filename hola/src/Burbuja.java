import java.util.Arrays;

public class Burbuja {
    public static void main(String[] args) {
        int temp;
        int [] arr = {4,8,5,1};
        System.out.println("Sin ordenar: "+Arrays.toString(arr));
        for (int i=0; i<arr.length-1; i++)
        {
for(int j= i+1; j< arr.length; j++)
{
    if (arr[i] > arr[j])
    {
 temp = arr[i];
arr [i] = arr [j];
arr [j] = temp;
    }
}
        }
        System.out.println("Ordenado: "+Arrays.toString(arr));
    }
}
