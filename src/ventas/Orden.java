package ventas;

public class Orden {
    private final int idOrden;
    private Producto[] productos;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    private static int contadorOrdenes;


    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto){
        if(this.contadorProductos < Orden.MAX_PRODUCTOS){
            this.productos[this.contadorProductos++] = producto;
        }else{
            System.out.println("Se ha superado el máximo de productos por orden");
        }

    }


    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++){
           total += this.productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden(){
        System.out.println("Id Orden: "+ this.idOrden);
        var totalOrden = this.calcularTotal();
        System.out.println("\tEl total de la Orden: $" + totalOrden);
        System.out.println("\tProductos de la Orden: ");
        for (int i =0; i < this.contadorProductos; i++){
            System.out.println("\t\t" + this.productos[i]);
        }
    }
}


