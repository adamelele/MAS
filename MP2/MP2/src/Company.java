import java.util.ArrayList;
import java.util.List;

public class Company {

    private String name;

    private List<Position> positions = new ArrayList<>();

    public Company(String name){
        this.name = name;
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



}
