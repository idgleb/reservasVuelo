public class Main {
    public static void main(String[] args) {

        Aerolinea aerolinea = new Aerolinea("Aeroflot");
        
        Vuelo vuelo = new Vuelo("EZS123", aerolinea);

        aerolinea.reservar_asiento("Gleb", 12434, vuelo);


    }
}