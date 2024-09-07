package section8_OOP.keyWordFinal;

class Truck {

    private String producent;
    private String model;
    private int wheels;
    private String color;

    private final int TOP_SPEED = 100;
    private final int ACCELERATION;

    public Truck(){
        this.producent = "Freightiner";
        this. model = "9664";
        this.wheels = 6;
        this.ACCELERATION = 60;
    }

    public Truck(String color){
        this();
        this.color = color;
    }

    public void printInfo(){
        System.out.println("Producent: "+this.producent + " Model:"+this.model+" Color:"+this.color);
    }
}

public class TruckExercise {

    public static void main(String[]args){

        Truck truck = new Truck("blue");
        truck.printInfo();

    }

}
