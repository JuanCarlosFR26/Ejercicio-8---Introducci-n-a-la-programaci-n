package Ejercicio8;

public class Persona {

    private int edad;
    private String nombre;
    private int telefono;

    public String getNombre() {
        System.out.println(nombre);
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        System.out.println(edad);
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        System.out.println(telefono);
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
