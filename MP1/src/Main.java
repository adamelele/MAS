import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    private static final File extentFileName = new File("src/extents/extent_file.txt");
    public static void main(String[] args) {

        boolean isExit = false;
        Scanner scanner = new Scanner(System.in);
        while( !isExit){
            System.out.println("""
                    1) Stwórz pracowników
                    2) Wyświetl pracowników
                    3) Zapisz ekstensje
                    4) Wczytaj ekstensje
                    5) Zakończ""");

            int input = scanner.nextInt();

            switch (input) {
                case 1 -> setWorkers();
                case 2 -> Worker.printExtents();
                case 3 -> serializeObjects();
                case 4 -> deserializeObjects();
                case 5 -> isExit = true;
                default -> System.out.println("Niepoprawny numer operacji");
            }
        }
    }

    private static void setWorkers(){
        Worker worker1 = new Worker(new String[]{"Adam", "Michal"} , "Przykladowy",
                LocalDate.of(2000,2,23),
                new Adress("Poland", "Warsaw", "Plac Defilad", 1) , 5820.60);
        Worker worker2 = new Worker(new String[]{"Kacper"}, "Example",
                LocalDate.of(1998,8,30)
                ,new Adress("Poland", "Warsaw", "Koszykowa", 86, 212) ,4910.20);
    }

    private static void serializeObjects(){
        try{
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(extentFileName));
            Worker.writeExtent(objectOutputStream);
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void deserializeObjects(){
        try{
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(extentFileName));
            Worker.readExtent(objectInputStream);
            objectInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
