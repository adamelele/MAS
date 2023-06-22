import Dynamic.Employee;
import Dynamic.Person;
import Dynamic.Student;
import Multiple_inheritance.Amphibious;
import Multiple_inheritance.Boat;
import Overlapping.Order;
import Overlapping.PersonOverlapped;
import Overlapping.PersonType;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PersonOverlapped personOverlapped = new PersonOverlapped("a", "b", "asd", "asdasd", 1, List.of(new Order(1)), PersonType.PERSON);

        personOverlapped.addPersonType(PersonType.CLIENT);

        personOverlapped.removePersonType(PersonType.CLIENT);

        Boat b  = new Boat(12,12,12);
        Amphibious a = new Amphibious(4,20,20,new Boat(13,13,13));


        System.out.println(a.getNumberOfDoors());

        Student dynamicStudent = new Student("School name", 1200,1400,"Adam", "Exmaple");
        System.out.println(dynamicStudent);
        Employee dynamicEmployee = new Employee(dynamicStudent, "job title", 5000);
        System.out.println(dynamicEmployee);


    }
}