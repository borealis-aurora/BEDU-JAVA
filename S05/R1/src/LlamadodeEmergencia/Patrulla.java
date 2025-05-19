package LlamadodeEmergencia;

//Subclase "extends": Patrulla
public class Patrulla extends UnidadEmergencia {
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    public Patrulla(String nombre, String nombreOperador) {
        super(nombre);
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador(nombreOperador);
    }

    public void iniciarOperacion() {
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }

    // Se sobreescribe el metodo
    @Override
    public void responder() {
        System.out.println("Activando unidad: Patrulla");
    }
}

