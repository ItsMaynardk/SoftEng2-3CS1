public class CarAssemble {
    public static void main(String [] args) {

        Car car = new Car.CarBuilder()
        .Brand("Nissan")
        .engineType("Diesel")
        .transmission("Manual")
        .Color("Blue")
        .PassengerCapacity(5)
        .build();

        System.out.println(car.brand);
        System.out.println(car.engineType);
        System.out.println(car.transmission);
        System.out.println(car.color);
        System.out.println(car.passengerCapacity);
    }
}