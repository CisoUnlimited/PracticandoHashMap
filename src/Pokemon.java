enum Tipo1{ACERO,AGUA,BICHO,DRAGON,ELECTRICO,FANTASMA,FUEGO,
    HADA,HIELO,LUCHA,NORMAL,PLANTA,PSIQUICO,ROCA,SINIESTRO,TIERRA,VENENO,VOLADOR,NINGUNO}
enum Tipo2{ACERO,AGUA,BICHO,DRAGON,ELECTRICO,FANTASMA,FUEGO,
    HADA,HIELO,LUCHA,NORMAL,PLANTA,PSIQUICO,ROCA,SINIESTRO,TIERRA,VENENO,VOLADOR,NINGUNO}


public class Pokemon {
    private String nombre;
    private Tipo1 tipo1;
    private Tipo2 tipo2;

    public Pokemon(String nombre, Tipo1 tipo1, Tipo2 tipo2) {
        this.nombre = nombre;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo1 getTipo1() {
        return tipo1;
    }

    public void setTipo1(Tipo1 tipo1) {
        this.tipo1 = tipo1;
    }

    public Tipo2 getTipo2() {
        return tipo2;
    }

    public void setTipo2(Tipo2 tipo2) {
        this.tipo2 = tipo2;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre='" + nombre + '\'' +
                ", tipo1=" + tipo1 +
                ", tipo2=" + tipo2 +
                '}';
    }
}
