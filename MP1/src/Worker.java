import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Worker implements Serializable {

    private static List<Worker> extent = new ArrayList<>();

    // Atrybut powtarzalny
    private String[] names;

    private String surname;

    // Atrybut złożony
    private LocalDate birthDate;

    // Atrybut klasowy
    private static final String companyName = "Example Company Corp.";

    // Atrybut pochodny
    private int age;

    // Atrybut opcjonalny
    private double bonusPercentage;

    private double baseSalary;

    public Worker(String[] names, String surname, LocalDate birthDate, double baseSalary){
        this.names = names;
        this.surname = surname;
        this.birthDate = birthDate;
        this.age = countAge(birthDate);
        this.baseSalary = baseSalary;
        extent.add(this);

    }

    // przeciążenie
    public Worker(String[] names, String surname, LocalDate birthDate, double baseSalary, double bonusPercentage){
        this.names = names;
        this.surname = surname;
        this.birthDate = birthDate;
        this.age = countAge(birthDate);
        this.bonusPercentage = bonusPercentage;
        this.baseSalary = baseSalary;
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
                ", salary="+ baseSalary +
                ", bonusPercentage=" + bonusPercentage;
    }

    private static void showExtension(){
        System.out.println(extent);
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
    public static void print(){
        extent.forEach(System.out::println);
    }
}
