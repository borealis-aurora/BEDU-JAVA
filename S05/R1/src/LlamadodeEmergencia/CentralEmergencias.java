package LlamadodeEmergencia;

//NUESTRO MAIN!!!
public class CentralEmergencias {
    public static void main(String[] args) {
        UnidadBomberos bomberos = new UnidadBomberos("Bomberos", "Daddy Yankee");
        Patrulla patrulla = new Patrulla("Patrulla", "Laufey");
        Ambulancia ambulancia = new Ambulancia("Ambulancia", "Billie");

        ambulancia.iniciarOperacion();
        System.out.println();

        patrulla.iniciarOperacion();
        System.out.println();

        bomberos.iniciarOperacion();
    }
}