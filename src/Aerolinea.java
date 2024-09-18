import javax.swing.*;

public class Aerolinea {
    private String nombre;

    public Aerolinea(String nombre) {
        this.nombre = nombre;
    }

    public Pasajero reservar_asiento(String nombre, int dni, Vuelo vuelo) {

        String asiento = "";
        Pasajero pasajero = null;
        do {
            asiento = JOptionPane.showInputDialog(null, "Elige el aciento: " + vuelo.getAsientos());
            if (asiento == null) asiento = "";
            if (vuelo.getOcupacionAciento(asiento) && !asiento.equals("0")){
                JOptionPane.showMessageDialog(null,
                        "Asiento ocupado o no existe");
            }else if(!asiento.equals("0")) {
                JOptionPane.showMessageDialog(null,
                        "Vos elegiste el asiento " + asiento);
                if (pasajero != null) {
                    vuelo.setOcupacionAciento(pasajero.getAsiento(),false);
                }
                pasajero = new Pasajero(nombre, dni, vuelo, asiento);
                vuelo.setOcupacionAciento(asiento,true);
            }
        } while (!asiento.equals("0"));

        if (pasajero != null){
            JOptionPane.showMessageDialog(null,
                    "Pasajero " + pasajero.getNombre() + " registrado con el asiento " + pasajero.getAsiento());
        } else{
            JOptionPane.showMessageDialog(null,
                    "Pasajero NO registrado");
        }

        return pasajero;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
