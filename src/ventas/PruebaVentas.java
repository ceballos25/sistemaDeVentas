package ventas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println(" ****** Bienvenido al Sistema de Ventas******");

        var camisa = new  Producto("Camisa", 50000.00);
        System.out.println(camisa);

        var pantalon = new Producto("Jenas", 80000.00);

        var orden1 = new Orden();
        orden1.agregarProducto(camisa);
        orden1.agregarProducto(pantalon);

        //Mostramos la orden
        orden1.mostrarOrden();

        var orden2 = new Orden();
        orden2.agregarProducto(camisa);
        orden2.agregarProducto(camisa);
        orden2.agregarProducto(pantalon);
        orden2.agregarProducto(camisa);
        orden2.agregarProducto(camisa);
        orden2.agregarProducto(pantalon);

        orden2.mostrarOrden();
    }
}
