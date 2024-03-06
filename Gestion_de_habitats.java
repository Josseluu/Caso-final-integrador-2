public class Gestion_de_habitats {
}
class Habitat {
    String nombre;
    double temperatura;
    double humedad;
    double limpieza;

    public Habitat(String nombre) {
        this.nombre = nombre;
        this.temperatura = 0;
        this.humedad = 0;
        this.limpieza = 0;
    }

    public void monitorear() {
        System.out.println("Monitoreando " + nombre + ":");
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Humedad: " + humedad);
        System.out.println("Limpieza: " + limpieza);
    }
}

class HabitatAcuatico extends Habitat {
    public HabitatAcuatico(String nombre) {
        super(nombre);
    }

    public void cambiarTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void cambiarHumedad(double humedad) {
        this.humedad = humedad;
    }

    public void cambiarLimpieza(double limpieza) {
        this.limpieza = limpieza;
    }
}
class HabitatTerrestre extends Habitat {
    public HabitatTerrestre(String nombre) {
        super(nombre);
    }
    public void cambiarTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    public void cambiarHumedad(double humedad) {
        this.humedad = humedad;
    }
    public void cambiarLimpieza(double limpieza) {
        this.limpieza = limpieza;
    }
}
class HabitatAviario extends Habitat {
    public HabitatAviario(String nombre) {
        super(nombre);
    }
    public void cambiarTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    public void cambiarHumedad(double humedad) {
        this.humedad = humedad;
    }
    public void cambiarLimpieza(double limpieza) {
        this.limpieza = limpieza;
    }
}
// Ejemplo de uso
class Main {
    public static void main(String[] args) {
        HabitatAcuatico acuario = new HabitatAcuatico("Acuario");
        acuario.cambiarTemperatura(25);
        acuario.cambiarHumedad(80);
        acuario.cambiarLimpieza(90);
        acuario.monitorear();

        HabitatAviario jaula = new HabitatAviario("Jaula de pájaros");
        jaula.cambiarTemperatura(22);
        jaula.cambiarHumedad(60);
        jaula.cambiarLimpieza(95);
        jaula.monitorear();
    }
}
