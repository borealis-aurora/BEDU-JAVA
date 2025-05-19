package SistPago;

public class PagoTransfer extends MetodoPago {
    private boolean validadoExternamente;

    public PagoTransfer(double monto, boolean validadoExternamente) {
        super(monto);
        this.validadoExternamente = validadoExternamente;
    }

    @Override
    public boolean autenticar() {
        return validadoExternamente;
    }

    @Override
    public void procesarPago() {
        System.out.println("Espere... Procesando transferencia de $" + monto);
    }
}

