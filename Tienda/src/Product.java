import java.time.LocalDateTime;

public class Product {
    private int id;
    private String title;
    private String description;
    private double price;
    private String category;
    private String image;
    private LocalDateTime dateTime; // Variable para almacenar la fecha y hora

    // Constructor que acepta todos los parámetros, incluyendo LocalDateTime
    public Product(int id, String title, String description, double price, String category, String image, LocalDateTime dateTime) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.category = category;
        this.image = image;
        this.dateTime = dateTime;  // Asignar la fecha y hora
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getImage() {
        return image;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\n" +
               "Nombre: " + title + "\n" +
               "Descripción: " + description + "\n" +
               "Precio: $" + price + "\n" +
               "Categoría: " + category + "\n" +
               "Imagen: " + image + "\n" +
               "Fecha de creación: " + dateTime + "\n" +  // Mostrar la fecha
               "--------------------------------------";
    }
}