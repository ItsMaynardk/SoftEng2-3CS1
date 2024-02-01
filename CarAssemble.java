public class CarAssemble {
    public static void main(String [] args) {

        Car car = new Car.CarBuilder()
        .engineType("Diesel")
        .transmission("Manual")
        .color("Blue")
        .passengerCapacity(5)
        .brand("Ford")
        .build();

        System.out.println(car.brand);
        System.out.println(car.engineType);
        System.out.println(car.transmission);
        System.out.println(car.color);
        System.out.println(car.passengerCapacity);
    }
}