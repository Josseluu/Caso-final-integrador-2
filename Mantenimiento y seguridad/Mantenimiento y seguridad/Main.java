import java.util.Date;

// Clase para representar una instalación del zoológico
class Instalacion {
    private String nombre;
    private String tipo;
    private String estadoMantenimiento;

    public Instalacion(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.estadoMantenimiento = "Operativa";
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEstadoMantenimiento() {
        return estadoMantenimiento;
    }

    public void setEstadoMantenimiento(String estadoMantenimiento) {
        this.estadoMantenimiento = estadoMantenimiento;
    }
}

// Clase para representar tareas de mantenimiento
class Mantenimiento {
    private String descripcion;
    private Date fecha;
    private boolean esUrgente;
    private boolean completado;

    public Mantenimiento(String descripcion, Date fecha, boolean esUrgente) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.esUrgente = esUrgente;
        this.completado = false;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public boolean esUrgente() {
        return esUrgente;
    }

    public boolean estaCompletado() {
        return completado;
    }

    public void completar() {
        this.completado = true;
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
        // Ejemplo de uso del sistema de mantenimiento
        Instalacion jaulaLeones = new Instalacion("Jaula de Leones", "Jaula");
        Mantenimiento mantenimientoJaula = new Mantenimiento("Reparación de valla", new Date(), true);
        jaulaLeones.setEstadoMantenimiento("En reparación");


        SistemaSeguridad sistemaSeguridad = new SistemaSeguridad();
        sistemaSeguridad.monitorearAccesos();
        sistemaSeguridad.monitorearMovimientos();
    }
}
