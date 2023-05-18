package Overlapping;

import java.util.EnumSet;
import java.util.List;

public class PersonOverlapped {

    private String firstName;
    private String lastName;
    private String email;
    private String pesel;
    private Integer clientId;
    private List<Order> orders;


    private EnumSet<PersonType> personTypes = EnumSet.of(PersonType.PERSON);

    public PersonOverlapped(String firstName, String lastName, String email, String pesel, Integer clientId, List<Order> orders, PersonType personType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.pesel = pesel;
        this.clientId = clientId;
        this.orders = orders;
        if (!personTypes.contains(personType)){
            this.personTypes.add(personType);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPesel() throws Exception {
        if (personTypes.contains(PersonType.EMPLOYEE))
            return pesel;
        else
            throw new Exception("Person is not an Employee");
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Integer getClientId() throws Exception {
        if (personTypes.contains(PersonType.CLIENT))
            return clientId;
        else
            throw new Exception("Person is not a Client");
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public List<Order> getOrders() throws Exception {
        if (personTypes.contains(PersonType.CLIENT))
            return orders;
        else
            throw new Exception("Person is not a Client");
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void addPersonType(PersonType type){
        if (!personTypes.contains(type)){
            personTypes.add(type);
        }
    }

    public void removePersonType(PersonType type){
        personTypes.remove(type);
    }

    public EnumSet<PersonType> getPersonTypes() {
        return personTypes;
    }
}
