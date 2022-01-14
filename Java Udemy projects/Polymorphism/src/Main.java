class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders,String name){
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine(){
        return "Car's engine is starting";
    }

    public String accelerate(){
        return "Car is accelerating";
    }

    public String brake(){
        return "Car is braking";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

class Mitsubishi extends Car{
    public Mitsubishi(int cylinders,String name) {
        super(cylinders,name);
    }

    public String startEngine(){
        return "Mitsubishi's engine is starting";
    }

    public String accelerate(){
        return "Mitsubishi is accelerating";
    }

    public String brake(){
        return "Mitsubishi is braking";
    }
}

class Ford extends Car{
    public Ford(int cylinders,String name){
        super(cylinders,name);
    }

    public String startEngine(){
        return "Ford's engine is starting";
    }

    public String accelerate(){
        return "Ford is accelerating";
    }

    public String brake(){
        return "Ford is braking";
    }
}

class Holden extends Car{
    public Holden(int cylinders,String name){
        super(cylinders,name);
    }
    public String startEngine(){
        return "Holden's engine is starting";
    }

    public String accelerate(){
        return "Holden is accelerating";
    }

    public String brake(){
        return "Holden is braking";
    }
}



public class Main {
    public static void main(String[] args) {
        Car car = new Car(8,"Base Car");
        System.out.println(car.getCylinders() + " " + car.getName());
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6,"Outlander VRX 4WD");
        System.out.println(mitsubishi.getCylinders() + " " + mitsubishi.getName());
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6,"Ford Falcon");
        System.out.println(ford.getCylinders() + " " + ford.getName());
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6,"Holden Commodore");
        System.out.println(holden.getCylinders() + " " + holden.getName());
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }
}