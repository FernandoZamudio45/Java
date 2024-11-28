package hola;
import java.util.ArrayList;
public class arrayLforeach {
	public static void main(String[] args) {
ArrayList<Integer> a = new ArrayList<>();
a.add(10);
a.add(20);
a.add(30);
for (Integer valor : a)
{
	System.out.println(valor);
}
	}
}
