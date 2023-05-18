package Multiple_inheritance;

public class Car {
    private int numberOfDoors;
    private int enginePower;
    private int topSpeed;

    public Car(int numberOfDoors, int enginePower, int topSpeed) {
        this.numberOfDoors = numberOfDoors;
        this.enginePower = enginePower;
        this.topSpeed = topSpeed;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void drive(){
        System.out.println("zooom");
    }

}
