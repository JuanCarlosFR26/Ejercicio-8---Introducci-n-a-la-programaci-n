package Ejercicio8;

public class Principal {

    public static void main(String[] args) {

        Persona persona1 = new Persona();

        persona1.setNombre("Juan");
        persona1.setEdad(15);
        persona1.setTelefono(644456657);

        persona1.getNombre();
        persona1.getEdad();
        persona1.getTelefono();
    }
}
