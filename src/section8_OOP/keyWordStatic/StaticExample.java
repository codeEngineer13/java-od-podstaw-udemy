package section8_OOP.keyWordStatic;

// 2 STATIC CONSTANT
class MyMath{
    final static double PI = 3.14159265358;
}


class Plane{
    // 1 Static Variable
    // wspólny id dla wszystkich obiektów klasy
    static int nextId = 1;

    // unikalny id dla kazdego obiektu
    int id;

    // 3 STATIC METHOD
    static int getNextId(){
        return nextId++;
    }


    Plane(){
        id=nextId;
        nextId++;
    }

//    Plane(){
//        id=Plane.getNextId();
//    }
}

public class StaticExample {

    // There are some example from this section
    public static void main(String[]args){

        Plane p1 = new Plane();
        Plane p2 = new Plane();
        Plane p3 = new Plane();

        System.out.println(p1.id);
        System.out.println(p2.id);
        System.out.println(p3.id);

        int a = p1.getNextId();  // ZŁA PRAKTYKA: Nie będzie błędu kompilacji, ale ta metoda nie jest wywoływana na p1, tylko jako statyczna metoda.
        int b = Plane.getNextId(); // DOBRA PRAKTYKA

    }
}
