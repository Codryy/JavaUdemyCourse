public class Main {

    public static void main(String[] args) {

        Audi audi = new Audi(36);
        audi.steer(45);
        System.out.println("*********");
        audi.accelerate(30);
        System.out.println("*********");
        audi.accelerate(20);
        System.out.println("*********");
        audi.accelerate(-42);
    }
}

public class Vehicle {

    public String name;
    public String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size){
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
    }

    public void move(int velocity, int direction) {
        currentDirection = direction;
        currentVelocity = velocity;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop() {
        currentVelocity = 0;
    }
}


//
//    private int size, terrain;
//    private String steering;
//    private int speed;
//
//    public Vehicle(int size, int terrain) {
//        this.size = size;
//        this.terrain = terrain;
//    }
//
//    public int getSize() {
//        return size;
//    }
//
//    public int getTerrain() {
//        return terrain;
//    }
//
//    public void setSteering(String steering) {
//        this.steering = steering;
//    }
//
//    public void setSpeed(int speed) {
//        this.speed = speed;
//    }
//
//    public String getSteering() {
//        return steering;
//    }
//
//    public int getSpeed() {
//        return speed;
//    }

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

public class Audi extends Car{

    private int roadServiceMonths;

    public Audi(int roadServiceMonths) {
        super("Audi", "4wd", 4, 4, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {

        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0 ) {
            stop();
            changeGear(1);
        } else if( (newVelocity > 0) && (newVelocity <= 10) ) {
            changeGear(1);
        } else if( (newVelocity > 10) && (newVelocity <= 20) ) {
            changeGear(2);
        } else if( (newVelocity > 20) && (newVelocity <= 30) ) {
            changeGear(3);
        } else {
            changeGear(4);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
