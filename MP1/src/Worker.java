import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Worker implements Serializable {

    List<Worker> extent = new ArrayList<>();

    // Atrybut powtarzalny
    private String[] names;

    private String surrname;

    // Atrybut złożony
    private LocalDate birthDate;

    // Atrybut klasowy
    private static final String companyName = "Example Company Corp.";

    // Atrybut pochodny
    private int age;

    // Atrybut opcjonalny
    private double bonusPercentage;

    private double baseSalary;

    public Worker(String[] names, String surrname, LocalDate birthDate, double baseSalary){
        this.names = names;
        this.surrname = surrname;
        this.birthDate = birthDate;
        this.age = countAge(birthDate);
        this.baseSalary = baseSalary;
        extent.add(this);

    }

    public Worker(String[] names, String surrname, LocalDate birthDate, double baseSalary, double bonusPercentage){
        this.names = names;
        this.surrname = surrname;
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
                ", surrname='" + surrname + '\'' +
                ", birthDate=" + birthDate +
                ", age=" + age +
                ", salary="+ baseSalary +
                ", bonusPercentage=" + bonusPercentage;
    }

    private void showExtension(){
        System.out.println(extent);
    }
}
