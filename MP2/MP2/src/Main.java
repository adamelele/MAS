import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //=============== Asosjacja z atrybutem ====================

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

            Position positionEmp1 = new Position(employee1, company1, "Developer", "Senior");
            Position positionEmp2 = new Position(employee2, company1, "Manager", null);
            Position positionEmp3 = new Position(employee3, company1,"Frontend Developer", "Mid" );

        // =============================================================================

        // ================== Kompozycja ===================================
            Client client = new Client("Adam");

        try {
          client.addOrder(Order.createOrder(client));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //=============================================

        //=================== Asocjacja zwykła ==================
        Product product = new Product(client.getOrders().get(0), "super product", 220.49, 4);

        client.getOrders().get(0).addProduct(product);

        //==========================================

        //=============== Asocjacja kwalifikowana =================
        employee1.addOrder(client.getOrders().get(0));

        //========================================================
    }
}