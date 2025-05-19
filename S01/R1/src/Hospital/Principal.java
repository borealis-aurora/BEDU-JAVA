package Hospital;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el nombre del paciente: ");
        String nombre = input.nextLine();

        System.out.print("Ingrese la edad del paciente: ");
        int edad = input.nextInt();
        input.nextLine(); // Limpiar buffer

        System.out.print("Ingrese el número de expediente: ");
        String expediente = input.nextLine();

        Paciente paciente = new Paciente(nombre, edad, expediente);
        paciente.mostrarInformacion();

        input.close();
    }
}