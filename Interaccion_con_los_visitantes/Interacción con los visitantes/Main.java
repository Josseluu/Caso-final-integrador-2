
class Animal {
    protected String nombre;
    protected String descripcion;

    public Animal(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
    }
}


class Ave extends Animal {
    public Ave(String nombre, String descripcion) {
        super(nombre, descripcion);
    }
}

class Mamifero extends Animal {
    public Mamifero(String nombre, String descripcion) {
        super(nombre, descripcion);
    }
}


interface Tour {
    void realizarTour();
}


class TourParaNinos implements Tour {
    private Animal[] animales;

    public TourParaNinos(Animal[] animales) {
        this.animales = animales;
    }

    public void realizarTour() {
        System.out.println("¡Bienvenidos al tour para niños!");
        System.out.println("Aquí están algunos de los animales que les encantarán: lobos, tigres,leopardos,osos...");
        for (Animal animal : animales) {
            animal.mostrarInformacion();
        }
    }
}

class TourDeAves implements Tour {
    private Animal[] aves;

    public TourDeAves(Animal[] aves) {
        this.aves = aves;
    }

    public void realizarTour() {
        System.out.println("¡Bienvenidos al tour de aves!");
        System.out.println("Estas son algunas de las hermosas aves que verán: Fénix, aguilas y halcones ");
        for (Animal ave : aves) {
            ave.mostrarInformacion();
        }
    }
}

class QuioscoInteractivo {
    private Animal[] animales;
    private String[] habitats;

    public QuioscoInteractivo(Animal[] animales, String[] habitats) {
        this.animales = animales;
        this.habitats = habitats;
    }

    public void mostrarInformacionAnimal(String nombre) {
        for (Animal animal : animales) {
            if (animal.nombre.equalsIgnoreCase(nombre)) {
                animal.mostrarInformacion();
                return;
            }
        }
        System.out.println("No se encontró información para el animal " + nombre);
    }

    public void mostrarInformacionHabitat(String habitat) {
        System.out.println("Información sobre el hábitat de " + habitat + ": La selva es un ecosistema tropical densamente arbolado y humedo, habitado por muchos animales");

    }
}

public class Main {
    public static void main(String[] args) {

        Animal leon = new Mamifero("León", "El león es un felino grande y carnívoro que habita en las sabanas africanas.");
        Animal loro = new Ave("Loro", "Los loros son aves muy inteligentes y coloridas que pueden imitar sonidos y palabras.");


        TourParaNinos tourNinos = new TourParaNinos(new Animal[]{leon, loro});
        TourDeAves tourAves = new TourDeAves(new Animal[]{loro});


        tourNinos.realizarTour();
        tourAves.realizarTour();


        QuioscoInteractivo quiosco = new QuioscoInteractivo(new Animal[]{leon, loro}, new String[]{"Sabana", "Selva"});
        quiosco.mostrarInformacionAnimal("León");
        quiosco.mostrarInformacionHabitat("Selva");
    }
}
