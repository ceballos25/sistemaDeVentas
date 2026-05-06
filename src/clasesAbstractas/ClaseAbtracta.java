package clasesAbstractas;

public class ClaseAbtracta {
    public static void main(String[] args) {

        FiguraGeometrica figuraGeometrica = new Rectangulo();
        figuraGeometrica.dibujar();
    }
}


abstract class FiguraGeometrica{
    public abstract void dibujar();
}

class Rectangulo extends FiguraGeometrica{
    @Override
    public void dibujar(){
        System.out.println("Se dibuja el rectangulo");
    }
}