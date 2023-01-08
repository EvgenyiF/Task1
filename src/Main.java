public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        GasolineCar toyota = new GasolineCar();
        DieselCar ford = new DieselCar();


        ford.fuel();
        toyota.fuel();
    }
}