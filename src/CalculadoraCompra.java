public class CalculadoraCompra {
    public static void main (String []args){
        double precioOriginalProducto = 150.75;
        double porcentajeDescuento = 0.20;
        int cantidadProductos = 3;
        boolean esClientePremium = true;
        boolean tieneCupon = false;
        double montoDescuento = precioOriginalProducto * porcentajeDescuento;
        double precioDescuentoUnitario = precioOriginalProducto - montoDescuento;
        double precioTotalCompra = precioDescuentoUnitario * cantidadProductos;
        double precioFinal
    }
}
