// Clase principal JuegoAhorcado
import java.io.Console;

public class JuegoAhorcado {
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.println("La consola no está disponible. Por favor, ejecute en una terminal.");
            return;
        }

        // Ingresar la palabra por el profesor
        char[] palabraIngresada = console.readPassword("Profesor, ingrese una palabra: ");
        Palabra palabra = new Palabra(new String(palabraIngresada).toLowerCase());

        // Limpiar la pantalla
        System.out.println("\n\n\n\n\n\n\n\n\n");

        int intentosFallidos = 0;
        Ahorcado ahorcado = new Ahorcado();

        while (intentosFallidos < 6 && !palabra.estaCompletamenteAdivinada()) {
            palabra.mostrarPalabraOculta();
            System.out.print("Estudiante, adivine una letra: ");
            char letra = console.readLine().toLowerCase().charAt(0);

            if (!palabra.intentarLetra(letra)) {
                intentosFallidos++;
                ahorcado.mostrar(intentosFallidos);
            }
        }

        if (palabra.estaCompletamenteAdivinada()) {
            System.out.println("¡Felicidades, adivinaste la palabra!");
        } else {
            System.out.println("La palabra era: " + palabra.getPalabraOriginal());
        }
    }
}

