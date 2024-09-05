package section8_OOP.methodOverloading;

public class RoadsterMain {

    public static void main(String[] args){
        Roadster car1 = new Roadster(100, 120);
        Roadster car2 = new Roadster(100, 120, 200, 240);

        // car 1 and car 2
        System.out.println("Car 1 speed and acceleration: "+car1.getTopSpeed() +" and "+car1.getAcceleration());
        System.out.println("Car 2 speed and acceleration: "+car2.getTopSpeed(true) +" and "+car2.getAcceleration(true));



    }
}
