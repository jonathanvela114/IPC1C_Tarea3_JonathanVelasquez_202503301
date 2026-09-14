public class Main {
    public static void main(String[] args){
        Vehiculo[] guardado  = new Vehiculo[4];

        guardado[0] = new Automovil("P123GTR", "Mazda", 340.0, 5);
        guardado[1] = new Automovil("P234GTS", "Toyota", 360.0, 6);
        guardado[2] = new Motocicleta("M456CBR", "Honda", 180, 600);
        guardado[3] = new Motocicleta("M368ZHH", "Kawasaki", 200, 900);

        double totalguardado = 0.0;

        System.out.println("GUARDADO DE VEHÍCULOS");
        System.out.println();

        for (Vehiculo v : guardado){
            double tarifa = v.calcularTarifa();
            totalguardado += tarifa;
            System.out.println(v.getPlaca() + " " + v.getMarca() + " Q" + tarifa);
        }
        System.out.println();
        System.out.println("TOTAL DE DINERO: Q " +totalguardado);
    }


}
