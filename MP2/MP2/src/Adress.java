public class Adress {

    private String street;
    private int streetNumber;
    private Integer houseNumber;
    private String country;
    private String city;

    public Adress(String street, int streetNumber, Integer houseNumber, String country, String city) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.houseNumber = houseNumber;
        this.country = country;
        this.city = city;
    }

    public Adress(String country, String city, String street, int strNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.streetNumber = strNumber;
    }

    @Override
    public String toString() {
        if (houseNumber == null) {
            return "["+street + " " + streetNumber+ ", " + city + " " + country + "]\n";
        }
        return "["+street + " " + streetNumber + "/" + houseNumber + ", " + city + " " + country + "]\n";
    }
}
