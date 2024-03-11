import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class RecursoTest {

}

class Recurso {
    protected String nombre;
    protected int cantidad;

    public Recurso(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad disponible: " + cantidad);
    }
}


class Alimento extends Recurso {
    public Alimento(String nombre, int cantidad) {
        super(nombre, cantidad);
    }
}

class Medicina extends Recurso {
    public Medicina(String nombre, int cantidad) {
        super(nombre, cantidad);
    }
}

class Equipamiento extends Recurso {
    public Equipamiento(String nombre, int cantidad) {
        super(nombre, cantidad);
    }
}


class ManejadorRecursos {
    private Map<String, Recurso> inventario;

    public ManejadorRecursos() {
        this.inventario = new HashMap<>();
    }

    public void agregarRecurso(Recurso recurso) {
        inventario.put(recurso.nombre, recurso);
    }

    public void mostrarInventario() {
        System.out.println("Inventario del zoológico:");
        for (Recurso recurso : inventario.values()) {
            recurso.mostrarInformacion();
        }
    }


}

public class Main {
    public static void main(String[] args) {

        Alimento carne = new Alimento("Carne", 100);
        Medicina vacunas = new Medicina("Vacunas", 50);
        Equipamiento jaulas = new Equipamiento("Jaulas", 20);


        ManejadorRecursos manejador = new ManejadorRecursos();
        manejador.agregarRecurso(carne);
        manejador.agregarRecurso(vacunas);
        manejador.agregarRecurso(jaulas);


        manejador.mostrarInventario();
    }
}
