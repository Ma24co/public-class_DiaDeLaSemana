import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase Random
        Random random = new Random();

        // Generar un número entero al azar entre 1 y 7 (inclusive)
        int numero = random.nextInt(7) + 1;

        // Mostrar el número generado
        System.out.println("Número generado: " + numero);

        // Estructura switch para determinar el día correspondiente
        switch (numero) {
            case 1 -> System.out.println("Día: lunes");
            case 2 -> System.out.println("Día: martes");
            case 3 -> System.out.println("Día: miércoles");
            case 4 -> System.out.println("Día: jueves");
            case 5 -> System.out.println("Día: viernes");
            case 6 -> System.out.println("Día: sábado");
            case 7 -> System.out.println("Día: domingo");
            default -> System.out.println("Número fuera de rango.");
        }
    }
}
