import java.util.Scanner;
import java.util.Random;
import java.util.random.RandomGenerator;
// Ejercicio: Juego de adivinanza
//Descripción: Crea un programa en Java
// que permita al usuario adivinar un número
// generado aleatoriamente por el sistema.
// El programa debe utilizar estructuras de
// control if, while o do-while para gestionar
// la lógica del juego.


public class juegoAdivinanza {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) +1;
        int intento;
        int intentos = 0;

        System.out.println("Bienvenido al juego de adivinanza!!!!");
        System.out.println("Intenta adivinar un número del 1 al 100!!!!!");

        do {
            System.out.println("Prueba con un número . Vamos!!!");
            intento = sc.nextInt();
            intentos++;

            if (intento < numeroAleatorio) {
                System.out.println("El número es mayor.");
            } else if (intento > numeroAleatorio) {
                System.out.println("El número es menor. ");
            } else {
                System.out.println(" Ole ole has acertado el número!!!!!!!! solo te ha costado" + intentos + "intentos");
            }
        } while (intento != numeroAleatorio);

        sc.close();

            }
        }






