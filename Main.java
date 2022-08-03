class Car {

    private String name;
    private int cylinders, wheels;
    private boolean engine;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public void startEngine() {
        System.out.println("Placeholder for starting engine");
    }

    public void accelerate() {
        System.out.println("Placeholder for accelerating");
    }

    public void brake() {
        System.out.println("Placeholder for slowing down");
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }
}

class Audi extends Car {

    public Audi() {
        super("Audi RS7", 6);
    }

    @Override
    public void startEngine() {
        System.out.println("Audi RS7 starting engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Audi RS7 accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Audi RS7 slowing down");
    }
}

class Mercedes extends Car {

    public Mercedes() {
        super("Mercedes AMG", 8);
    }

    @Override
    public void startEngine() {
        System.out.println("Mercedes AMG starting engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Mercedes AMG accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Mercedes AMG slowing down");
    }
}

class BMW extends Car {

    public BMW() {
        super("BMW M3 GTR", 8);
    }

    @Override
    public void startEngine() {
        System.out.println("BMW M3 GTR starting engine");
    }

    @Override
    public void accelerate() {
        System.out.println("BMW M3 GTR starting engine");
    }

    @Override
    public void brake() {
        System.out.println("BMW M3 GTR starting engine");
    }
}

class Placeholder extends Car {

    public Placeholder() {
        super("Placeholder name", 0);
    }
}

public class Main {

    public static void main(String[] args) {
        Car car1 = new Audi();
        Car car2 = new Mercedes();
        Car car3 = new BMW();
        Car car4 = new Placeholder();

        car1.startEngine();
        car1.accelerate();
        car1.brake();
        System.out.println("************");
        car2.startEngine();
        car2.accelerate();
        car2.brake();
        System.out.println("************");
        car3.startEngine();
        car3.accelerate();
        car3.brake();
        System.out.println("************");
        car4.startEngine();
        car4.accelerate();
        car4.brake();
    }
}
