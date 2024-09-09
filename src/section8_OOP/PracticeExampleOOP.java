package section8_OOP;

class Plane{

    // wspólny id dla wszystkich obiektów klasy
    static int nextId = 1;

    // unikalny id dla kazdego obiektu
    int id;

    Plane(){
        id=nextId;
        nextId++;
    }
}

public class PracticeExampleOOP {

    // There are some example from this section
    public static void main(String[]args){

        Plane p1 = new Plane();
        Plane p2 = new Plane();
        Plane p3 = new Plane();

        System.out.println(p1.id);
        System.out.println(p2.id);
        System.out.println(p3.id);

    }
}
