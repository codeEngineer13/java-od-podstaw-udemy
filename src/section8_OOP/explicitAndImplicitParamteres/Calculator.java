package section8_OOP.explicitAndImplicitParamteres;

public class Calculator {

    /*
    W tym przykładzie a i b to jawne parametry, natomiast this, które odnosi się do obiektu Calculator,
    jest parametrem niejawnym. Parametry jawne używamy, gdy chcemy przekazać dane bezpośrednio,
    natomiast niejawne są używane wewnątrz metod obiektowych, by odwołać się do bieżącego obiektu.
     */
    // Explicit parameter: 'int b' is passed to the method
    public int add(int a, int b) {
        return a + b;  // Implicit parameter 'this' refers to the current Calculator object
    }
}
