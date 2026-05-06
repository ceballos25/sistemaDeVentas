package javaBeans;

import java.io.Serializable;

public class JavaBeans {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Cristian");
        persona.setApellido("Ceballos");
        System.out.println(persona.presentarse());
    }
}

class Persona implements Serializable {
    private String nombre;
    private String apellido;

    public Persona(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String presentarse(){
        return "Mi nombre:\n" + getNombre() + "\nMi apellido:\n" + getApellido();
    }
}