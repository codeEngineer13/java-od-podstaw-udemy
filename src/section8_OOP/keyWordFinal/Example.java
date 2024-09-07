package section8_OOP.keyWordFinal;
/* Example: Method */
class Parent {
    //METODA
    public final void display() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    // Nie można nadpisać metody display() w klasie Child, ponieważ jest ona final.
}

/* Example: Variable */
public class Example {

    public static void main(String[] args) {
        // ZMIENNA
        final int number = 10;
        // number = 20;  // Błąd kompilacji - zmienna final nie może być zmieniona
    }
}

/*Example: Object*/
final class FinalClass {
    // Ta klasa nie może być dziedziczona
}

// class SubClass extends FinalClass { // Błąd kompilacji - klasa final nie może być rozszerzana
// }