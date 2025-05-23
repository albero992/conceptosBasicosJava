public class CalculadoraCompra {
    public static void main(String[] args) {

        double precioOriginalProducto = 150.75;
        double porcentajeDescuento = 0.20; // Esto representa un 20%
        int cantidadProductos = 3;
        boolean esClientePremium = true;
        boolean tieneCupon = false;


        double montoDescuento = precioOriginalProducto * porcentajeDescuento;


        double precioConDescuentoUnitario = precioOriginalProducto - montoDescuento;


        double precioTotalCompra = precioConDescuentoUnitario * cantidadProductos;


        double precioFinal = precioTotalCompra; // Inicializamos precioFinal con el total actual


        System.out.println("No se aplicó descuento adicional (no es Premium o no tiene cupón).");



        double umbralEnvioGratis = 100.0;
        boolean envioGratis = precioFinal > umbralEnvioGratis;


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