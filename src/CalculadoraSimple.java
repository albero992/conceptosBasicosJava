import java.util.Scanner; // Importa la clase Scanner para leer la entrada del usuario

public class CalculadoraSimple {

    public static void main(String[] args) {
        // 1. Crear un objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // 2. Pedir al usuario el primer número
        System.out.print("Introduce el primer número entero: ");
        int numero1 = scanner.nextInt(); // Lee el primer número entero

        // 3. Pedir al usuario el segundo número
        System.out.print("Introduce el segundo número entero: ");
        int numero2 = scanner.nextInt(); // Lee el segundo número entero

        // 4. Pedir al usuario la operación
        System.out.print("Introduce la operación (+, -, *, /): ");
        String operacion = scanner.next(); // Lee la operación como un String

        int resultado = 0; // Variable para almacenar el resultado
        boolean operacionValida = true; // Bandera para verificar si la operación es válida

        // 5. Usar una estructura de control de flujo (switch en este caso)
        switch (operacion) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                // 6. Manejar la división por cero
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                    operacionValida = false; // La operación no es válida
                }
                break;
            default:
                System.out.println("Error: Operación no válida. Por favor, usa +, -, * o /.");
                operacionValida = false; // La operación no es válida
                break;
        }

        // 7. Mostrar el resultado si la operación fue válida
        if (operacionValida) {
            System.out.println("El resultado de " + numero1 + " " + operacion + " " + numero2 + " es: " + resultado);
        }

        // 8. Cerrar el objeto Scanner
        scanner.close();
    }
}