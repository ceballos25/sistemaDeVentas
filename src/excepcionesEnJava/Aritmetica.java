package excepcionesEnJava;

public class Aritmetica {
    public static int division(int numerador, int denominador){
        if (denominador == 0){
            throw new RuntimeException("Divison entre 0");
        }
        return numerador / denominador;
    }
}
