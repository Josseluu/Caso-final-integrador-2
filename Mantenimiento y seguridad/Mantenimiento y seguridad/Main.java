import java.util.Scanner;


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


class SistemaSeguridad {
    public void monitorearAccesos() {
        System.out.println("Monitoreando accesos...");

    }

    public void monitorearMovimientos() {
        System.out.println("Monitoreando movimientos...");

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el nombre de la instalación: ");
        String nombreInstalacion = scanner.nextLine();
        System.out.print("Ingrese el tipo de instalación: ");
        String tipoInstalacion = scanner.nextLine();


        Instalacion instalacion = new Instalacion(nombreInstalacion, tipoInstalacion);

        SistemaSeguridad sistemaSeguridad = new SistemaSeguridad();
        sistemaSeguridad.monitorearAccesos();
        sistemaSeguridad.monitorearMovimientos();

        scanner.close();
    }
}
