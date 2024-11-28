package Módulos;
import javax.swing.*;
import java.awt.*;
import java.net.URL;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class  Imagen {

    
        public void mImagen (){
        SwingUtilities.invokeLater(() -> {
            try {
                // URL de la imagen (asegúrate de que esta URL sea válida)
                String urlString = "https://www.w3schools.com/w3images/fjords.jpg"; // Cambia esta URL por la imagen que desees cargar
                System.out.println("Intentando cargar la imagen desde la URL: " + urlString);
                
                URL url = new URL(urlString);
                
                // Intentamos leer la imagen
                BufferedImage image = ImageIO.read(url);
                
                if (image == null) {
                    System.out.println("No se pudo cargar la imagen. Es posible que la URL no apunte a una imagen válida.");
                    JOptionPane.showMessageDialog(null, "No se pudo cargar la imagen desde la URL proporcionada.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Mostrar la imagen en la ventana
                ImageIcon imageIcon = new ImageIcon(image);
                JLabel imageLabel = new JLabel(imageIcon);

                JFrame frame = new JFrame("Mostrar Imagen Desde URL");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(image.getWidth() + 50, image.getHeight() + 50); // Ajustar el tamaño de la ventana
                frame.setLocationRelativeTo(null); // Centrar la ventana
                frame.add(imageLabel);
                frame.setVisible(true);

                System.out.println("Imagen cargada correctamente.");

            } catch (IOException e) {
                // Si ocurre un error al cargar la imagen, mostramos el mensaje de error
                System.err.println("Error al intentar cargar la imagen: " + e.getMessage());
                JOptionPane.showMessageDialog(null, "Error al cargar la imagen: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

    }    
    
    }


