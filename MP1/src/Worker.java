import java.io.Serializable;
import java.time.LocalDate;

public class Worker implements Serializable {

    // Atrybut powtarzalny
    private String names;

    private String surrname;

    // Atrybut złożony
    private LocalDate hireDate;

    // Atrybut klasowy
    private static final String companyName = "Example Company Corp.";

    // Atrybut pochodny
    private int age;

    // Atrybut opcjonalny
    private Double bonus;





}
