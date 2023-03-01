public class Car extends Vehicle {
    private int doors;
    private int seats;

    public Car(String brand, int kilometers, int doors, int seats) {
        super(brand, kilometers);
        this.doors = doors;
        this.seats = seats;
    }

    public int getDoors() {
        return this.doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSeats() {
        return this.seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String doStuff() {
        return "Je suis " + this.getBrand() + " et je fais vroum vroum !";
    }

}
