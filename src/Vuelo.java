public class Vuelo {
    private String nombre;
    private String asientos[][];
    private boolean ocupacionAcientos[][];
    private Aerolinea aerolinea;

    public Vuelo(String nombre, Aerolinea aerolinea) {

        this.nombre = nombre;

        this.asientos = new String[][]{
                {"A", "B", "C"},
                {"D", "E", "F"},
                {"G", "H", "I"},
        };

        this.ocupacionAcientos = new boolean[][]{
                {false, false, false},
                {false, false, false},
                {false, false, false},
        };

    }

    public boolean getOcupacionAciento(String aciento) {
        boolean isNoExisteAciento = true;
        for (int i = 0; i < ocupacionAcientos.length; i++) {
            for (int j = 0; j < ocupacionAcientos[i].length; j++) {
                if (aciento.equals(asientos[i][j]) && ocupacionAcientos[i][j]) {
                    return true;
                }
                if (isNoExisteAciento) isNoExisteAciento = !aciento.equals(asientos[i][j]);
            }
        }
        return isNoExisteAciento;
    }

    public String setOcupacionAciento(String aciento, boolean ocupacion) {
        for (int i = 0; i < ocupacionAcientos.length; i++) {
            for (int j = 0; j < ocupacionAcientos[i].length; j++) {
                if (aciento.equals(asientos[i][j])) {
                    ocupacionAcientos[i][j] = ocupacion;
                    return "";
                }
            }
        }
        return "No existe este aciento";
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsientos() {
        String asientosStr = "";
        String ocupacionAcientosStr = "";
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                ocupacionAcientosStr = ocupacionAcientos[i][j] ? " OCUPADO " : " DISPONIBLE ";
                asientosStr += "\n" + asientos[i][j] + ocupacionAcientosStr;
            }
        }
        return asientosStr;
    }

    public void setAsientos(String[][] asientos) {
        this.asientos = asientos;
    }


}
