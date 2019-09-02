public class Address {

    private String name;
    private String city;
    private String state;
    private String zipCode;

    public Address(String name, String city, String state, String zipCode) {
        this.name = name;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }
}
