import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Worker implements Serializable {

    private static List<Worker> extent = new ArrayList<>();

    // Atrybut powtarzalny
    private String[] names;

    private String surname;

    private LocalDate birthDate;

    // Atrybut klasowy
    private static final String companyName = "Example Company Corp.";

    // Atrybut pochodny
    private int age;
    // Atrybut złożony
    private Adress adress;

    private double salary;
    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public Worker(String[] names, String surname, LocalDate birthDate, Adress adress, double salary){
        this.names = names;
        this.surname = surname;
        this.birthDate = birthDate;
        this.age = countAge(birthDate);
        this.adress = adress;
        this.salary = salary;
        extent.add(this);

    }


    private int countAge(LocalDate birthDate){
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    //przesłonięcie
    @Override
    public String toString() {
        return  "names=" + Arrays.toString(names) +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", age=" + age +
                ",\nadress=" + adress +
                ", salary="+ salary ;
    }


    public static void writeExtent(ObjectOutputStream stream){
        try{
            stream.writeObject(extent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readExtent(ObjectInputStream stream){
        try{
            extent = (ArrayList<Worker>)stream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    //Metoda klasowa
    public static void printExtents(){
        extent.forEach(System.out::println);
    }

    private double getBruttoSalary(){
        return salary * 0.9;
    }
    //przeciążenie
    private double getBruttoSalary( double bonusPercentage){
        return (salary * bonusPercentage + salary) * 0.9;
    }
}
