import com.google.gson.Gson;
import java.io.IOException; // Aunque no la usamos aquí directamente, es bueno tenerla.
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        int opcion = 0; // Variable para guardar la opción del usuario

        // Creamos un objeto de la clase ConsultaAPI
        ConsultaAPI consulta = new ConsultaAPI();

        // --- BUCLE PRINCIPAL DEL MENÚ ---
        while (opcion != 9) {
            System.out.println("*************************************************");
            System.out.println("Sea bienvenido/a al Conversor de Moneda =]");
            System.out.println("");
            System.out.println("1) Dólar =>> Peso Argentino");
            System.out.println("2) Peso Argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real Brasileño");
            System.out.println("4) Real Brasileño =>> Dólar");
            System.out.println("5) Dólar =>> Peso Colombiano");
            System.out.println("6) Peso Colombiano =>> Dólar");
            System.out.println("9) Salir");
            System.out.println("*************************************************");
            System.out.print("Elija una opción válida: ");

            // --- 3. MANEJO DE ERRORES (TRY-CATCH) ---
            // Todo lo que pueda fallar (lectura de usuario, API) va dentro del try.
            try {
                opcion = lectura.nextInt(); // Lee la opción del menú

                if (opcion == 9) {
                    break; // Si es 9, rompe el 'while' y termina el programa.
                }

                // --- 4. SELECCIÓN DE MONEDAS (SWITCH) ---
                String monedaBase = "";
                String monedaDestino = "";

                switch (opcion) {
                    case 1:
                        monedaBase = "USD";
                        monedaDestino = "ARS";
                        break;
                    case 2:
                        monedaBase = "ARS";
                        monedaDestino = "USD";
                        break;
                    case 3:
                        monedaBase = "USD";
                        monedaDestino = "BRL";
                        break;
                    case 4:
                        monedaBase = "BRL";
                        monedaDestino = "USD";
                        break;
                    case 5:
                        monedaBase = "USD";
                        monedaDestino = "COP";
                        break;
                    case 6:
                        monedaBase = "COP";
                        monedaDestino = "USD";
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                        continue; // Vuelve al inicio del 'while'
                }

                // --- 5. PEDIR CANTIDAD ---
                System.out.print("Ingrese el valor que desea convertir: ");
                double cantidad = lectura.nextDouble();

                // --- 6. CONSULTA API Y GSON ---
                String jsonRespuesta = consulta.obtenerDatos(monedaBase, monedaDestino);

                Gson gson = new Gson();
                Moneda moneda = gson.fromJson(jsonRespuesta, Moneda.class);

                // --- 7. CÁLCULO Y RESULTADO ---
                double tasaConversion = moneda.conversion_rate();
                double resultado = cantidad * tasaConversion;

                // Resultado formateado
                System.out.printf("El valor %.2f [%s] corresponde al valor final de: %.2f [%s]%n",
                        cantidad,
                        monedaBase,
                        resultado,
                        monedaDestino);


            } catch (InputMismatchException e) {
                // Captura si el usuario escribe "hola" en lugar de un número
                System.out.println("Error: Ingrese solo números válidos.");
                lectura.next(); //Limpia el buffer del scanner
            } catch (Exception e) {
                // Captura cualquier otro error
                System.out.println("Ocurrió un error inesperado: " + e.getMessage());
            }

            System.out.println("---------------------------------");
        } // --- FIN DEL BUCLE WHILE ---

        // --- 8. DESPEDIDA ---
        System.out.println("Gracias por usar el conversor de monedas.");
        System.out.println("Finalizando la aplicación...");
        lectura.close();
    }
}