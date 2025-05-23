public class CalculadoraCompra {
    public static void main(String[] args) {
        // 2. Declarar e inicializar variables iniciales
        double precioOriginalProducto = 150.75;
        double porcentajeDescuento = 0.20; // Esto representa un 20%
        int cantidadProductos = 3;
        boolean esClientePremium = true;
        boolean tieneCupon = false;

        // 3. Realizar los cálculos utilizando los operadores apropiados:

        // Paso 1: Calcular el monto del descuento.
        double montoDescuento = precioOriginalProducto * porcentajeDescuento;

        // Paso 2: Calcular el precio del producto después del descuento.
        double precioConDescuentoUnitario = precioOriginalProducto - montoDescuento;

        // Paso 3: Calcular el precio total de todos los productos.
        double precioTotalCompra = precioConDescuentoUnitario * cantidadProductos;

        // Paso 4: Aplicar un descuento adicional si es cliente premium y tiene un cupón.
        double precioFinal = precioTotalCompra; // Inicializamos precioFinal con el total actual

        // Usamos un 'if' para aplicar el descuento condicional
        if (esClientePremium && tieneCupon) { // Operador lógico '&&' (AND)
            precioFinal = precioFinal * 0.90; // Aplicar 10% de descuento adicional
            // O también: precioFinal -= precioFinal * 0.10;
            System.out.println("¡Se aplicó un descuento adicional del 10% por ser cliente Premium y tener cupón!");
        } else {
            System.out.println("No se aplicó descuento adicional (no es Premium o no tiene cupón).");
        }


        // Paso 5: Evaluar si la compra supera cierto umbral.
        double umbralEnvioGratis = 100.0;
        boolean envioGratis = precioFinal > umbralEnvioGratis; // Operador de comparación '>'

        // 4. Imprimir todos los resultados intermedios y finales en la consola
        System.out.println("--- Detalles de la Compra ---");
        System.out.println("Precio original del producto: " + precioOriginalProducto + "€");
        System.out.println("Porcentaje de descuento: " + (porcentajeDescuento * 100) + "%");
        System.out.println("Cantidad de productos: " + cantidadProductos);
        System.out.println("Es cliente Premium: " + esClientePremium);
        System.out.println("Tiene cupón: " + tieneCupon);
        System.out.println("-----------------------------");

        System.out.println("Monto del descuento: " + montoDescuento + "€");
        System.out.println("Precio unitario con descuento: " + precioConDescuentoUnitario + "€");
        System.out.println("Precio total de la compra antes del descuento adicional: " + precioTotalCompra + "€");
        System.out.println("Precio final de la compra: " + precioFinal + "€");
        System.out.println("Envío gratis: " + envioGratis);
        System.out.println("-----------------------------");
    }
}