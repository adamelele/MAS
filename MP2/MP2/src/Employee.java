import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String name;
    private String surname;
    private LocalDate birthday;
    private int age;
    private Adress adress;
    private Company company;

    private Employee(Company company, String name, String surname, LocalDate birthday, Adress adress) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.age = countAge(birthday);
        this.adress = adress;
    }
    
    public static Employee createEmployee(Company company, String name, String surname, LocalDate birthday, Adress adress) throws Exception {
        if (company == null){
            throw new Exception("Given company does not exist");
        }
        Employee employee = new Employee(company, name, surname, birthday, adress);

        company.addEmployee(employee);

        return employee;
    }

    private int countAge(LocalDate birthDate){
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}
