import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;

// Paso 1: Definimos la clase Tema e implementamos Comparable para ordenar por título
class Tema implements Comparable<Tema> {
    String titulo;
    int prioridad;

    public Tema(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    @Override
    public int compareTo(Tema otro) {
        return this.titulo.compareTo(otro.titulo); // Orden natural: alfabético
    }

    @Override
    public String toString() {
        return "Tema: " + titulo + " | Prioridad: " + prioridad;
    }
}

public class PlaneacionEducativa {
    public static void main(String[] args) {

        // Paso 2: Creamos una lista concurrente de temas usando CopyOnWriteArrayList
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();
        temas.add(new Tema("Variable Compleja", 2));
        temas.add(new Tema("Análisis Vectorial", 1));
        temas.add(new Tema("Mecánica Estadística", 3));

        // Paso 3: Ordenamos los temas alfabéticamente usando Comparable
        Collections.sort(temas);
        System.out.println("📚 Temas ordenados alfabéticamente:");
        for (Tema t : temas) {
            System.out.println(t);
        }

        // Paso 4: Ordenamos los temas por prioridad usando Comparator
        temas.sort(new Comparator<Tema>() {
            @Override
            public int compare(Tema a, Tema b) {
                return Integer.compare(a.prioridad, b.prioridad); // Prioridad ascendente
            }
        });

        System.out.println("\n🔥 Temas ordenados por prioridad (1 = urgente):");
        for (Tema t : temas) {
            System.out.println(t);
        }

        // Paso 5: Creamos un mapa concurrente de recursos usando ConcurrentHashMap
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Variable Compleja", "https://complex-analysis.com/");
        recursos.put("Análisis Vectorial", "https://www.whitman.edu/mathematics/calculus_online/chapter16.html");
        recursos.put("Mecánica Estadística", "https://web.stanford.edu/~peastman/statmech/");

        // Paso 6: Mostramos el repositorio de recursos por tema
        System.out.println("\n📦 Repositorio de recursos por tema:");
        for (String tema : recursos.keySet()) {
            System.out.println(tema + " → " + recursos.get(tema));
        }
    }
}