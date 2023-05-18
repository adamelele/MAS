package Multiple_inheritance;

public class Amphibious extends Car implements IBoat {
    private int enginePower;
    private int topSpeed;
    private Boat boat;
    public Amphibious(int enginePower, int topSpeed, int numberOfDoors, Boat boat) {
        super(enginePower, topSpeed, numberOfDoors);
        this.topSpeed = topSpeed;
        this.enginePower = enginePower;
        this.boat = boat;
    }

    @Override
    public int getTopSpeed() {
        return topSpeed;
    }

    @Override
    public int getBuoyancy() {
        return boat.getBuoyancy();
    }

    @Override
    public int getEnginePower() {
        return enginePower;
    }

    @Override
    public void swim() {
        System.out.println("Totally swimming now");
    }
}
