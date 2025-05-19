package ComparFac;

//clase Factura
public class Factura {

    // Atributos
    String folio;
    String cliente;
    double total;

    // Constructor con parámetros
    public Factura(String folio, String cliente, double total) {
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    // toString()
    @Override
    public String toString() {
        return "🧾 Factura [folio=" + folio + ", cliente=" + cliente + ", total=$" + total + "]";
    }

    // equals() -> ¿dos facturas tienen el mismo folio?
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; //espacio memoria
        if (obj == null || getClass() != obj.getClass()) return false;

        Factura otra = (Factura) obj;
        return this.folio.equals(otra.folio); // Comparamos solo el folio
    }

    // Metodo hashCode() consistente con equals(), basado en el folio
    @Override
    public int hashCode() {
        return folio.hashCode();
    }
}

