package section8_OOP.keyWordFinal;

/*
W Java słowo kluczowe final może również być użyte przy tworzeniu referencji obiektów. Jeśli referencja obiektu jest oznaczona jako final,
oznacza to, że nie może być przypisana do innego obiektu.
Jednak właściwości samego obiektu mogą być zmieniane (o ile obiekt na to pozwala).
 */
public class ExampleObject {
    public static void main(String[] args) {
        final Person person = new Person("John");
        person.setName("Doe");  // Zmiana stanu obiektu jest dozwolona

        // person = new Person("Jane");  // Błąd kompilacji - final nie pozwala na zmianę referencji
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
