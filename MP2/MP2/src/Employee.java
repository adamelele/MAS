import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {
    private String name;
    private String surname;
    private LocalDate birthday;
    private int age;
    private Adress adress;
    private List<Position> positions = new ArrayList<>();
    private Map<Integer, Order> processedOrders = new HashMap<>();

    public Employee(String name, String surname, LocalDate birthday, Adress adress) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.age = countAge(birthday);
        this.adress = adress;
    }


    private int countAge(LocalDate birthDate){
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public boolean linkPosition(Position position){
        if (positions.contains(position)){
            return false;
        }
        positions.add(position);
        return true;
    }

    public boolean unlinkPosition(Position position){
        if (!positions.contains(position)){
            return false;
        }
        positions.remove(position);
        return true;
    }

    public void addOrder(Order order){
        processedOrders.put(order.getOrderNumber(), order);
    }
}
