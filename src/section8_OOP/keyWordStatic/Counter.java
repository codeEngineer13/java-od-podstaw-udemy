package section8_OOP.keyWordStatic;

public class Counter {
    // Statyczna zmienna, współdzielona przez wszystkie instancje
    private static int count = 0;

    // Konstruktor zwiększa wartość zmiennej count
    public Counter() {
        count++;
    }

    // Statyczna metoda, dostępna bez tworzenia instancji klasy
    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();  // count = 1
        Counter c2 = new Counter();  // count = 2

        System.out.println(Counter.getCount());  // Wyświetli: 2
    }
}

