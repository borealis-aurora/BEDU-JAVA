package Registro;

// Sistema de entradas
public class Principal {
    public static void main(String[] args) {
        Entrada concierto = new Entrada("Concierto SKZ", 1200.00);
        Entrada musical = new Entrada("El Fantasma de la Opera", 850.00);

        concierto.mostrarInformacion();
        musical.mostrarInformacion();

        //Reto - EntradaRecord
        EntradaRecord baile= new EntradaRecord("El Lago de los Cisnes", 1500.00);
        baile.mostrarInformacion();
    }
}
