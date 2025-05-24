import java.util.Scanner;

public class CalculadoraSimple {
    public static void main (String []args){
        {
            public class scanner
        }};
        import java.util.Scanner;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número ");
        int numero1 = sc.nextInt();
        System.out.println("Has introducido el número " + numero1);
        int numero2 = sc.nextInt();
        System.out.println("Escribe un segundo número " + numero2);
        System.out.println("Introduce una operación aritmética (+ , - , * / ): ");
        String operacion = scanner.next();
        int resultado = 0;
        boolean operacionValida = true;

        //estructura control flujo

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
                //cuidado con el 0
                if (numero2 !=0) {
                    resultado = numero1 / numero2;
                    else {
                        System.out.println("Error no se puede dividir por cero  ");
                        operacionValida = false;
                        //la operación no es válida
                        {
                            break;
                            default:
                                System.out.println("Error: operación no es valida");
                                break;
                                if (operacionValida){
                                    System.out.println("El resultado de " + numero1 + "" + operacion + "" + numero2 + " es: " + resultado);
                                    //cerrar objet scanner
                                    scanner.close();

                                }
                        }
                }
        }

    }
}
