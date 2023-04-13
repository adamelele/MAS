import java.io.Serializable;

public class Adress implements Serializable {

    private String country;
    private String city;
    private String street;
    private int strNumber;
    // Atrybut opcjonalny
    private Integer houseNumber;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStrNumber() {
        return strNumber;
    }

    public void setStrNumber(int strNumber) {
        this.strNumber = strNumber;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }


    public Adress(String country, String city, String street, int strNumber, Integer houseNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.strNumber = strNumber;
        this.houseNumber = houseNumber;
    }

    public Adress(String country, String city, String street, int strNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.strNumber = strNumber;
    }

    @Override
    public String toString() {
        if (houseNumber == null) {
            return "["+street + " " + strNumber+ ", " + city + " " + country + "]\n";
        }
        return "["+street + " " + strNumber + "/" + houseNumber + ", " + city + " " + country + "]\n";
    }
}
