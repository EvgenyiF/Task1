import Enum.TypeFuel;
public class GasolineCar extends Car implements iRefueling{

    GasolineCar(){
        this.setFuelType(TypeFuel.GASOLINE);
    }

    @Override
    public void fuel() {
        System.out.println("Заправляем бензином");
    }
}
