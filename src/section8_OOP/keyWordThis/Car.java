package section8_OOP.keyWordThis;

public class Car {

    private String model;
    private int year;

        // Konstruktor 1 - przyjmuje tylko model
        public Car(String model) {
            this(model, 2023);  // Wywołuje drugi konstruktor, ustawiając domyślny rok
        }

        // Konstruktor 2 - przyjmuje model i rok
        public Car(String model, int year) {
            this.model = model;
            this.year = year;
        }

        public void displayInfo() {
            System.out.println("Model: " + this.model + ", Year: " + this.year);
        }

        public static void main(String[] args) {
            Car car1 = new Car("Toyota");
            car1.displayInfo();  // Model: Toyota, Year: 2023

            Car car2 = new Car("Honda", 2018);
            car2.displayInfo();  // Model: Honda, Year: 2018
        }

}
