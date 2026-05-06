package excepcionesEnJava;

public class Excepciones
{
    public static void main(String[] args) {

        try{
            var resultado = Aritmetica.division(2,0);
            System.out.println("resultado = " + resultado);
        }catch (Exception e){
            System.out.println("Algo salió mal: " + e);
        }
    }
}
