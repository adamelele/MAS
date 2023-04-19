import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Company company1 = new Company("Legit company");

        try{
            Employee employee1 = Employee.createEmployee(company1, "Adam", "Example",
                LocalDate.of(1999, 3, 21)
                , new Adress("Koszykowa",86, null,"Poland", "Warsaw"  ));
            Employee employee2 = Employee.createEmployee(company1, "Roman", "Test",
                    LocalDate.of(1999, 3, 21)
                    , new Adress("Koszykowa",86, null,"Poland", "Warsaw"  ));
            Employee employee3 = Employee.createEmployee(company1, "Magda", "Abacka",
                    LocalDate.of(1999, 3, 21)
                    , new Adress("Koszykowa",86, null,"Poland", "Warsaw"  ));
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}