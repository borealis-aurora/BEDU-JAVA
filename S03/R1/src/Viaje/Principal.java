package Viaje;

public class Principal {
    public static void main(String[] args) {
        // Crear un pasajero
        Pasajero pasajero = new Pasajero("Monkey D. Luffy", "P123456");

        // Crear un vuelo
        Vuelo vuelo = new Vuelo("1130", "God Valley", "18:30");

        // Reservar asiento
        boolean reservado = vuelo.reservarAsiento(pasajero);
        if (reservado) {
            System.out.println("✅ Reserva realizada con éxito.\n");
        } else {
            System.out.println("❌ No se pudo realizar la reserva.\n");
        }

        // Mostrar itinerario
        System.out.println(vuelo.obtenerItinerario());

        // Cancelar reserva
        System.out.println("❌ Cancelando reserva...\n");
        vuelo.cancelarReserva();

        // Itinerario actualizado
        System.out.println(vuelo.obtenerItinerario());

        // Nueva reservacion
        vuelo.reservarAsiento("Peter Parker", "U78KHJ");
        System.out.println(vuelo.obtenerItinerario());
    }
}