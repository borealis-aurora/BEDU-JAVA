package Hospital;

public class Paciente {
    String nombre;
    int edad;
    String expediente;

    public Paciente(String nombre, int edad, String expediente) {
        this.nombre = nombre;
        this.edad = edad;
        this.expediente = expediente;
    }

    public void mostrarInformacion() {
        System.out.println("Paciente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Expediente: " + expediente);
    }
}