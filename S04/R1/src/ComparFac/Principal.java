package ComparFac;

public class Principal {
    public static void main(String[] args) {

        // Dos facturas con distinto folio
        Factura f1 = new Factura("KAT002", "Katia Nuñez", 3000.00);
        Factura f2 = new Factura("DID001", "Didier Vazquez", 1900.00);

        // Dos facturas con mismo folio
        Factura f3 = new Factura("BTS098", "Yoyis Martinez", 350.00);
        Factura f4 = new Factura("BTS098", "Lorena Paez", 100.00);

        // Mostramos las 4 facturas con toString()
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);

        // Comparamos si son iguales usando equals()
        System.out.println("¿Las facturas f1 y f2 son iguales?: " + f1.equals(f2));
        System.out.println("¿Las facturas f3 y f4 son iguales?: " + f3.equals(f4));
    }
}
