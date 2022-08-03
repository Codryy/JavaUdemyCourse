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