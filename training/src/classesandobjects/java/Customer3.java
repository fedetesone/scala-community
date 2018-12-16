package classesandobjects.java;

public class Customer3 {
    private String id;
    private final String name;
    private final String address;

    public Customer3(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setId(String id) {
        if (this.id.isEmpty()) {
            this.id = id;
        }
    }

    public static void main(String[] args) {
        Customer3 bob = new Customer3("Bob", "Alvear 1520");
        bob.setId("0001");
    }
}

