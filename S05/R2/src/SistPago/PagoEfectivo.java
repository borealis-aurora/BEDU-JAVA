package SistPago;

//Clase que extiende Metodo Pago
public class PagoEfectivo extends MetodoPago {

    public PagoEfectivo(double monto) {
        super(monto);
    }

    @Override
    public boolean autenticar() {
        return true;  // No se requiere validación para efectivo
    }

    @Override
    public void procesarPago() {
        System.out.println("Espere... Procesando pago en efectivo de $" + monto);
    }
}

