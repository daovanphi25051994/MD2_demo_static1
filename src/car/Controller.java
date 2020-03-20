package car;

public class Controller {
    public static void main(String[] args) {
        Car car1 = new Car("lexus", "570cc");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("vinfast", "600cc");
        System.out.println(Car.numberOfCars);
        car1.setNumberOfCars(10);
        System.out.println(car1.numberOfCars);
        car2.setNumberOfCars(20);
        System.out.println(car2.numberOfCars);
        System.out.println(car1.numberOfCars);
    }
}
