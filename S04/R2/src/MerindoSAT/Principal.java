package MerindoSAT;

public class Principal {
    public static void main(String[] args) {

        // Declaración de impuestos
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("ZAZAZAZA0002", 6000.0);

        // Cuenta fiscal
        CuentaFiscal cuenta = new CuentaFiscal("ZAZAZAZA0004", 7000.0);

        // Info Declaración
        System.out.println("Declaración enviada por RFC: " + declaracion.rfcContribuyente() +
                " por $" + declaracion.montoDeclarado());
        cuenta.mostrarCuenta();

        // ¿RFC de la declaración es válido?
        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println("¿RFC válido para esta cuenta?: " + rfcValido);
    }
}
