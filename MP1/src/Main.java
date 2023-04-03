import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    private void setWorkers(){
        Worker worker1 = new Worker(new String[]{"Adam", "Michal"} , "Przykladowy", LocalDate.of(2000,2,23), 5820.60);
        Worker worker2 = new Worker(new String[]{"Kacper"}, "Example", LocalDate.of(1998,8,30), 4910.20, 12);
    }



}
