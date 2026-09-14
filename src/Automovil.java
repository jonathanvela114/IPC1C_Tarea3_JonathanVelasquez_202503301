public class Automovil extends Vehiculo {
    private int pasajeros;

    public Automovil(String placa, String marca, double tarifaBase, int pasajeros){
        super(placa, marca, tarifaBase);
        this.pasajeros = pasajeros;

    }

    @Override
    public double calcularTarifa(){
        return getTarifaBase() + (pasajeros + 15.0);
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
}
