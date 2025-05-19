package SistPago;

// Clase MAIN
public class CajaRegistradora {
    public static void main(String[] args) {
        MetodoPago[] pagos = {
                new PagoEfectivo(400.0),
                new PagoTarjeta(680.0, 800.0),
                new PagoTransfer(150.0, false) // esta fallará en autenticación
        };

        for (MetodoPago pago : pagos) {
            if (pago.autenticar()) {
                pago.procesarPago();
                System.out.println("✅ Autenticación exitosa.");
                pago.mostrarResumen();
            } else {
                System.out.println("❌ Fallo de autenticación. " + pago.getClass().getSimpleName() + " no válido.");
            }
            System.out.println();
        }
    }
}