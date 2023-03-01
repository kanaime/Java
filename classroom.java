
public class classroom {
    public static void main(String[] args) {
        Wilder wilder1 = new Wilder("Jean", true);
        Wilder wilder2 = new Wilder("Paul", false);
        System.out.println(wilder1.whoAmI());
        System.out.println(wilder2.whoAmI());
    }
}
