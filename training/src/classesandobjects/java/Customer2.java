package classesandobjects.java;

public class Customer2 {
    private String id;
    private final String name;
    private final String address;

    public Customer2(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Customer2 bob = new Customer2("Bob", "Alvear 1520");
        bob.setId("0001");
    }
}

