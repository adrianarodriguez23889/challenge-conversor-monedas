import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {

    // Creamos un método 'static' para poder llamarlo
    // sin necesidad de crear un objeto de esta clase.
    public static String getApiKey() {
        Properties props = new Properties();

        // Usamos 'try-with-resources' para asegurar que el archivo se cierre
        try (FileInputStream fis = new FileInputStream("config.properties")) {
            props.load(fis); // Carga las propiedades del archivo

            // Devuelve la propiedad que se llama "API_KEY"
            return props.getProperty("API_KEY");

        } catch (IOException e) {
            // Si el archivo no se encuentra o no se puede leer, la app no puede funcionar.
            // Lanzamos una excepción para que el programa falle rápido y nos avise.
            System.out.println("ERROR: No se pudo leer el archivo 'config.properties'.");
            System.out.println("Asegúrate de que el archivo exista en la raíz del proyecto.");
            throw new RuntimeException("Error al cargar la API Key", e);
        }
    }
}
