import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Company company1 = new Company("Legit company");

            Employee employee1 = new Employee("Adam", "Example",
                LocalDate.of(1999, 3, 21)
                , new Adress("Koszykowa",86, null,"Poland", "Warsaw"  ));
            Employee employee2 = new Employee("Roman", "Test",
                    LocalDate.of(1999, 3, 21)
                    , new Adress("Koszykowa",86, null,"Poland", "Warsaw"  ));
            Employee employee3 = new Employee("Magda", "Abacka",
                    LocalDate.of(1999, 3, 21)
                    , new Adress("Koszykowa",86, null,"Poland", "Warsaw"  ));

    }
}