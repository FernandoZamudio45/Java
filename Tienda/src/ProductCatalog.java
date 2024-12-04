import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Scanner;

public class ProductCatalog {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        Menu menu = new Menu(productService);
        menu.displayMenu();
    }
}
