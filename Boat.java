public class Boat extends Vehicle {
    private int length;

    public Boat(String brand, int kilometers, int length) {
        super(brand, kilometers);
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String doStuff() {
        return "Je suis " + this.getBrand() + " et je fais glou glou !";
    }

}
