import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private final ProductService productService;

    public Menu(ProductService productService) {
        this.productService = productService;
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int option = -1;

        while (option != 0) {
            System.out.println("*****************************************************");
            System.out.println("* Bienvenido al Catálogo de Productos              *");
            System.out.println("* 1) Buscar productos                              *");
            System.out.println("* 2) Agregar producto                              *");
            System.out.println("* 3) Eliminar producto                             *");
            System.out.println("* 0) Salir                                         *");
            System.out.println("*****************************************************");
            System.out.print("Elige una opción: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    searchMenu(scanner);
                    break;
                case 2:
                    addProduct(scanner);
                    break;
                case 3:
                    deleteProduct(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        }
        scanner.close();
    }
    private void deleteProduct(Scanner scanner) {
        System.out.print("Ingresa el ID del producto a eliminar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
    
        // Obtenemos la lista de productos del servicio
        List<Product> products = productService.getAllProducts();
    
        // Buscamos el producto con el ID ingresado
        Product toRemove = products.stream()
                                   .filter(product -> product.getId() == id)
                                   .findFirst()
                                   .orElse(null);
    
        // Si encontramos el producto, lo eliminamos
        if (toRemove != null) {
            products.remove(toRemove);
            System.out.println("Producto eliminado exitosamente.");
    
            // Mostrar cuántos productos quedan en la lista
            System.out.println("Quedan " + products.size() + " productos en total.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
    
    
private void addProduct(Scanner scanner) {
    System.out.println("Ingresa los datos del nuevo producto:");

    System.out.print("ID: ");
    int id = scanner.nextInt();
    scanner.nextLine(); // Limpiar el buffer

    System.out.print("Nombre: ");
    String name = scanner.nextLine();

    System.out.print("Descripción: ");
    String description = scanner.nextLine();

    System.out.print("Precio: ");
    double price = scanner.nextDouble();
    scanner.nextLine(); // Limpiar el buffer

    System.out.print("Categoría: ");
    String category = scanner.nextLine();

    System.out.print("URL de la imagen: ");
    String image = scanner.nextLine();

    // Usamos LocalDateTime.now() para asignar la fecha y hora actuales de creación
    Product newProduct = new Product(id, name, description, price, category, image, LocalDateTime.now());

    // Agregar el nuevo producto al catálogo de productos
    productService.getAllProducts().add(newProduct);

    System.out.println("Producto agregado exitosamente.");
}
    private void searchMenu(Scanner scanner) {
        System.out.println("*****************************************************");
        System.out.println("¿Cómo deseas buscar el producto?");
        System.out.println("* a) Por ID                     *" );
        System.out.println("* b) Por categoría              *");
        System.out.println("* c) Por nombre o descripción    *");
        System.out.println("* d) Por rango de precios        *");
        System.out.println("* e) Volver al menú principal    *");
        System.out.println("*****************************************************");
        System.out.print("Elige una opción: ");
        String choice = scanner.nextLine().toLowerCase();

        switch (choice) {
            case "a":
                searchById(scanner);
                break;
            case "b":
                searchByCategory(scanner);
                break;
            case "c":
                searchByNameOrDescription(scanner);
                break;
            case "d":
                searchByPriceRange(scanner);
                break;
            case "e":
                System.out.println("Volviendo al menú principal...");
                break;
            default:
                System.out.println("Opción inválida. Inténtalo de nuevo.");
        }
    }

private void searchByPriceRange(Scanner scanner) {
    System.out.print("Ingresa el precio mínimo: ");
    double minPrice = scanner.nextDouble();
    System.out.print("Ingresa el precio máximo: ");
    double maxPrice = scanner.nextDouble();
    scanner.nextLine(); // Limpiar el buffer

    // Llamamos al servicio para obtener productos en el rango de precios
    List<Product> products = productService.searchByPriceRange(minPrice, maxPrice);

    // Verificar si se encontraron productos
    if (products.isEmpty()) {
        System.out.println("No se encontraron productos en este rango de precios.");
    } else {
        // Mostrar los productos encontrados
        for (Product product : products) {
            System.out.println(product); // Mostrar cada producto usando su método toString()
        }
    }
}

    private void searchByNameOrDescription(Scanner scanner) {
        System.out.print("Ingresa el nombre o descripción del producto: ");
        String query = scanner.nextLine().toLowerCase(); // Convertir la entrada a minúsculas para hacer una búsqueda insensible a mayúsculas/minúsculas
    
        // Filtrar los productos que coincidan con el nombre o descripción
        List<Product> products = productService.getAllProducts().stream()
            .filter(product -> product.getTitle().toLowerCase().contains(query) ||
                               product.getDescription().toLowerCase().contains(query))
            .toList();
    
        // Verificar si se encontraron productos
        if (products.isEmpty()) {
            System.out.println("No se encontraron productos que coincidan con la búsqueda.");
        } else {
            // Mostrar los productos encontrados
            for (Product product : products) {
                System.out.println(product); // Mostrar el producto usando el método toString() de la clase Product
            }
        }
    }
    
    private void searchById(Scanner scanner) {
        System.out.print("Ingresa el ID del producto: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Product product = productService.getProductById(id);
        if (product != null) {
            System.out.println(product); // Muestra el producto, incluyendo la fecha y hora
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private void searchByCategory(Scanner scanner) {
        System.out.print("Ingresa la categoría: ");
        String category = scanner.nextLine();
        List<Product> products = productService.searchByCategory(category);
        if (products.isEmpty()) {
            System.out.println("No se encontraron productos en esta categoría.");
        } else {
            for (Product product : products) {
                System.out.println(product); // Muestra el producto con fecha y hora
            }
        }
    }
    
}