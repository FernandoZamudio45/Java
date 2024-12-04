import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class ProductService {
    private static final String API_URL = "https://fakestoreapi.com/products";
    private List<Product> productList;

    public ProductService() {
        productList = fetchProducts();
    }

    public List<Product> fetchProducts() {
        List<Product> products = new ArrayList<>();
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(API_URL).openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            JSONArray jsonArray = new JSONArray(response.toString());
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject obj = jsonArray.getJSONObject(i);
                products.add(new Product(
                    obj.getInt("id"),
                    obj.getString("title"),
                    obj.getString("description"),
                    obj.getDouble("price"),
                    obj.getString("category"),
                    obj.getString("image"),
                    LocalDateTime.now() // Aquí pasamos la fecha y hora actual
                ));
            }
        } catch (Exception e) {
            System.out.println("Error al cargar los productos: " + e.getMessage());
        }
        return products;
    }

    public List<Product> getAllProducts() {
        return productList;
    }

    public Product getProductById(int id) {
        return productList.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }
    // Este es el método que filtra los productos por el rango de precios
    public List<Product> searchByPriceRange(double minPrice, double maxPrice) {
        List<Product> result = new ArrayList<>();
        for (Product product : productList) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                result.add(product);
            }
        }
        return result;
}
public List<Product> searchByCategory(String category) {
    List<Product> result = new ArrayList<>();
    for (Product product : productList) {
        if (product.getCategory().equalsIgnoreCase(category)) {  // Compara ignorando mayúsculas/minúsculas
            result.add(product);
        }
    }
    return result;
}
}