public class CalculadoraAreasGeometricas {

    // Función para calcular el área de un rectángulo
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    // Función para calcular el área de un círculo
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio; // O Math.PI * Math.pow(radio, 2);
    }

    public static void main(String[] args) {
        // Ejemplo para el rectángulo
        double baseRectangulo = 5.0;
        double alturaRectangulo = 10.0;
        double areaRectangulo = calcularAreaRectangulo(baseRectangulo, alturaRectangulo);
        System.out.println("El área del rectángulo con base " + baseRectangulo + " y altura " + alturaRectangulo + " es: " + areaRectangulo);

        // Ejemplo para el círculo
        double radioCirculo = 7.0;
        double areaCirculo = calcularAreaCirculo(radioCirculo);
        System.out.println("El área del círculo con radio " + radioCirculo + " es: " + areaCirculo);
    }
}

