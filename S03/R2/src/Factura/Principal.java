package Factura;

public class Principal {
    public static void main(String[] args) {
        // Factura con RFC
        Factura facturaconRFC = new Factura(2500.0, "Servicio1", "KHAJF678OLKF");

        // Factura sin RFC (se pasa null)
        Factura facturaSinRFC = new Factura(1800.0, "Servicio2", null);

        // Mostrar ambas facturas
        System.out.println(facturaconRFC.getResumen());
        System.out.println(facturaSinRFC.getResumen());
    }
}
