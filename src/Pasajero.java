public class Pasajero {
    private String nombre;
    private int dni;
    private Vuelo vuelo;
    private String asiento;

    public Pasajero(String nombre, int dni, Vuelo vuelo, String asiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.vuelo = vuelo;
        this.asiento = asiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
}
