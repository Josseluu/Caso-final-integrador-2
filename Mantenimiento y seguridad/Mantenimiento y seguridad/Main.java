import java.util.Scanner;

// Clase para representar una instalación del zoológico
class Instalacion {
    private String nombre;
    private String tipo;

    public Instalacion(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }
}

// Clase para representar el sistema de seguridad
class SistemaSeguridad {
    public void monitorearAccesos() {
        System.out.println("Monitoreando accesos...");
        // Lógica para monitorear accesos utilizando cámaras y sensores
    }

    public void monitorearMovimientos() {
        System.out.println("Monitoreando movimientos...");
        // Lógica para monitorear movimientos utilizando cámaras y sensores
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar información sobre la instalación
        System.out.print("Ingrese el nombre de la instalación: ");
        String nombreInstalacion = scanner.nextLine();
        System.out.print("Ingrese el tipo de instalación: ");
        String tipoInstalacion = scanner.nextLine();

        // Crear la instalación
        Instalacion instalacion = new Instalacion(nombreInstalacion, tipoInstalacion);

        // Ejemplo de uso del sistema de seguridad
        SistemaSeguridad sistemaSeguridad = new SistemaSeguridad();
        sistemaSeguridad.monitorearAccesos();
        sistemaSeguridad.monitorearMovimientos();

        scanner.close();
    }
}
