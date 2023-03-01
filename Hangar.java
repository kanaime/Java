public class Hangar {
    public static void main(String[] args) {
        Car car = new Car("Peugeot", 200000, 5, 5);
        Boat boat = new Boat("Titanic", 100000, 1000);
        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());
    }

}
