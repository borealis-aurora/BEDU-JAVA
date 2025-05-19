import java.util.*;

public class RegistroMuestras {
    public static void main(String[] args) {

        // 1: ArrayList para registrar el orden de registro de las muestras genéticas
        ArrayList<String> muestras = new ArrayList<>();

        // Nombres de las especies en orden
        muestras.add("Homo sapiens");
        muestras.add("Mus musculus");
        muestras.add("Arabidopsis thaliana");
        muestras.add("Homo sapiens");

        System.out.println("📋 Muestras recibidas en orden:");
        for (int i = 0; i < muestras.size(); i++) {
            System.out.println((i + 1) + ". " + muestras.get(i));
        }

        // 2: HashSet para obtener las especies únicas procesadas
        HashSet<String> especiesUnicas = new HashSet<>(muestras);

        System.out.println("\n✅ Especies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        // 3: HashMap para asociar ID de muestra con el nombre del investigador
        HashMap<String, String> muestrasInvestigador = new HashMap<>();

        // Asociaciones ID → Investigador
        muestrasInvestigador.put("M-001", "Dra. Figueroa");
        muestrasInvestigador.put("M-002", "Dr. Valdez");
        muestrasInvestigador.put("M-003", "Dra. Geigenmaster");
        muestrasInvestigador.put("M-004", "Dr. Collins");

        System.out.println("\n👩‍🔬 Asignación de muestras a investigadores:");
        for (Map.Entry<String, String> entry : muestrasInvestigador.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // 4: Resultados. Búsqueda de investigador por ID de muestra
        String idBuscar = "M-003";
        System.out.println("\n🔍 Investigador responsable de la muestra " + idBuscar + ": " + muestrasInvestigador.get(idBuscar));
    }
}