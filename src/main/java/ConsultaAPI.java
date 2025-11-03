
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaAPI {

    public String obtenerDatos(String monedaBase, String monedaDestino) {

        String apiKey = ConfigLoader.getApiKey();

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" +
                apiKey + "/pair/" +
                monedaBase + "/" +
                monedaDestino);

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return response.body();

        } catch (IOException e) {
            // Esto captura errores si no hay conexión a internet
            System.out.println("Error de I/O: No se pudo conectar a la API. Verifica tu conexión.");
            throw new RuntimeException("Error al consultar la API", e);
        } catch (InterruptedException e) {
            // Esto captura errores si la conexión es interrumpida
            System.out.println("Error: La conexión fue interrumpida.");
            throw new RuntimeException("Conexión interrumpida", e);
        }
    }
}
