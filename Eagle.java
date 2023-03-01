public class Eagle implements Fly {
    private String name;

    public Eagle() {
        name = "Eyes cherry";
        System.out.println("new Eagle");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying");
        System.out.println(getName() + " flies upward, altitude : 120");
        System.out.println(getName() + " flies upward, altitude : 150");
        System.out.println(getName() + " It glides into the air.");
        System.out.println(getName() + " flies downward, altitude : 10");
        System.out.println(getName() + " is flying");
        System.out.println(getName() + " is too high, it can't lands.");
        System.out.println(getName() + " flies downward, altitude : 1");
        System.out.println(getName() + " lands on the ground.");
    }

}
