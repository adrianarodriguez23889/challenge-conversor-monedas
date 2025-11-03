# Challenge ONE: Conversor de Monedas

# Un conversor de monedas simple pero potente, construido en Java, que consume una API en tiempo real para obtener las tasas de cambio. Este proyecto es un desafío del programa Oracle Next Education (ONE) en colaboración con Alura Latam.

# 

# 🚀 Características

# Menú Interactivo: Una interfaz de consola limpia y fácil de usar.

# 

# Conversiones Soportadas:

# 

# Dólar (USD) a Peso Argentino (ARS)

# 

# Peso Argentino (ARS) a Dólar (USD)

# 

# Dólar (USD) a Real Brasileño (BRL)

# 

# Real Brasileño (BRL) a Dólar (USD)

# 

# Dólar (USD) a Peso Colombiano (COP)

# 

# Peso Colombiano (COP) a Dólar (USD)

# 

# Consumo de API: Se conecta a la ExchangeRate-API para obtener las tasas de conversión más recientes.

# 

# Manejo de Errores: Valida la entrada del usuario y maneja errores de conexión o de API.

# 

# Seguridad: La API Key se almacena de forma segura en un archivo .properties y no se expone en el código fuente.

# 

# 🛠️ Tecnologías Utilizadas

# Java 17+

# 

# Gson: Librería de Google para analizar (parsear) la respuesta JSON de la API.

# 

# Java HttpClient: Cliente HTTP nativo de Java para realizar las solicitudes a la API.

# 

# IntelliJ IDEA: Como entorno de desarrollo.

# 

# Git \& GitHub: Para el control de versiones.

# 

# DEMOSTRACIÓN

# 

# Menú Principal:

# 

# \*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*

# Sea bienvenido/a al Conversor de Moneda =]

# 

# 1\) Dólar =>> Peso Argentino

# 2\) Peso Argentino =>> Dólar

# 3\) Dólar =>> Real Brasileño

# 4\) Real Brasileño =>> Dólar

# 5\) Dólar =>> Peso Colombiano

# 6\) Peso Colombiano =>> Dólar

# 9\) Salir

# \*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*

# Elija una opción válida:

# Resultado de una Conversión:1

# 

# Ingrese el valor que desea convertir: 100

# El valor 100.00 \[USD] corresponde al valor final de: 98543.21 \[ARS]



# ⚙️ Cómo Ejecutar el Proyecto

# Clonar el repositorio:

# 

# Bash

# 

# git clone https://github.com/adrianarodriguez23889/challenge-conversor-monedas.git

# Configurar la API Key (¡Importante!) Este proyecto requiere una API Key de ExchangeRate-API para funcionar.

# 

# Crea una cuenta gratuita para obtener tu clave.

# 

# En la raíz del proyecto, crea un archivo llamado config.properties.

# 

# Añade tu clave al archivo de esta forma:

# 

# Properties

# 

# API\_KEY=AQUI\_VA\_TU\_API\_KEY\_PERSONAL

# El archivo .gitignore ya está configurado para ignorar este archivo, por lo que tu clave estará segura.

# 

# Abrir en IntelliJ IDEA:

# 

# Abre el proyecto desde IntelliJ (File > Open...).

# 

# Asegúrate de tener la librería Gson agregada. Si usaste la carpeta lib, ve a File > Project Structure... > Modules > Dependencies y añade el JAR de Gson.

# 

# Ejecutar:

# 

# Navega al archivo src/main/java/Main.java.

# 

# Haz clic derecho y selecciona "Run 'Main.main()'".

# 

# 👨‍💻 Autor

# Adriana Rodriguez - LinkedIn: www.linkedin.com/in/adriana-beatriz-rodriguez

