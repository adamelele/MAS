package Multiple_inheritance;

public class Boat implements IBoat{
    private int buoyancy;
    private Integer enginePower;
    private Integer topSpeed;

    public Boat(int buoyancy, int enginePower, int topSpeed) {
        this.buoyancy = buoyancy;
        this.enginePower = enginePower;
        this.topSpeed = topSpeed;
    }


    @Override
    public int getTopSpeed() {
        return topSpeed;
    }

    @Override
    public int getBuoyancy() {
        return buoyancy;
    }

    @Override
    public int getEnginePower() {
        return enginePower;
    }

    @Override
    public void swim() {

    }

}
