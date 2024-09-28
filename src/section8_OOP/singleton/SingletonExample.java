package section8_OOP.singleton;

/*

Wzorzec projektowy Singleton w języku Java służy do zapewnienia, że dana klasa ma tylko jedną instancję i udostępnia globalny punkt dostępu do tej instancji.
Jest często stosowany, gdy potrzebujemy mieć pewność, że istnieje tylko jeden obiekt klasy, który zarządza jakimś zasobem,
np. połączeniem do bazy danych, logowaniem, czy zarządzaniem konfiguracją systemu.

Struktura:
1) Prywatny konstruktor: Zapobiega tworzeniu obiektów poza klasą.
2) Statyczne pole instancji: Przechowuje jedyną instancję klasy.
3) Statyczna metoda: Zwraca jedyną instancję klasy, tworząc ją, jeśli jeszcze nie istnieje.

 */

public class SingletonExample {
    // Prywatne statyczne pole przechowujące jedyną instancję
    private static SingletonExample instance;

    // Prywatny konstruktor, aby zapobiec tworzeniu obiektów z zewnątrz
    private SingletonExample() {
        System.out.println("Singleton instance created");
    }

    // Publiczna metoda dostępu, która zwraca jedyną instancję
    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample(); // Tworzenie instancji tylko przy pierwszym wywołaniu
        }
        return instance;
    }

    // Przykładowa metoda klasy
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

