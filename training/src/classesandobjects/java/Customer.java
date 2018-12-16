package classesandobjects.java;

public class Customer {
    private final String name;
    private final String address;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        Customer bob = new Customer("Bob", "Alvear 1520");
    }
}
