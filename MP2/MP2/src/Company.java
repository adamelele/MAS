import java.util.ArrayList;
import java.util.List;

public class Company {

    private String name;

    private List<Employee> employees = new ArrayList<>();

    public Company(String name){
        this.name = name;
    }

    public void addEmployee(Employee employee){
        if (!employees.contains(employee)){
            employees.add(employee);
        }
    }


}
