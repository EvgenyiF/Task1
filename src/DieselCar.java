import Enum.TypeFuel;

public class DieselCar extends Car implements iRefueling{

    DieselCar(){
        this.setFuelType(TypeFuel.DIESEL);
    }
    @Override
    public void fuel() {
        System.out.println("Заправляем Дизельным топливом");

    }
}
