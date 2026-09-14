public abstract class Vehiculo {

    private String placa;
    private String marca;
    private double tarifaBase;

    public Vehiculo(String placa, String marca, double tarifaBase) {
        this.placa = placa;
        this.marca = marca;
        this.tarifaBase = tarifaBase;
    }

    public abstract double CalculoTarifa();

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }
}
