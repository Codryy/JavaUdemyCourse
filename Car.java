public class Car extends Vehicle{

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManuel) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManuel;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeGear(): Chnged to " + this.currentGear + " gear");
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
        move(speed,direction);
    }
//
//    @Override
//    public void stop() {
//        super.stop();
//    }
}

//    private int doors, wheels;
//    private int changingGears;
//    public Car(int size, int terrain, int doors, int wheels) {
//        super(size, terrain);
//        this.doors = doors;
//        this.wheels = wheels;
//    }
//
//    public int getDoors() {
//        return doors;
//    }
//
//    public int getWheels() {
//        return wheels;
//    }
//
//    public int getChangingGears() {
//        return changingGears;
//    }
//
//    public void setChangingGears(int changingGears) {
//        this.changingGears = changingGears;
//    }