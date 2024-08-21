package operadores;

public class OperadoresLogicos {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Operador && (AND Lógico)
        System.out.println("a && b: " + (a && b));  // false, porque b é false

        // Operador || (OR Lógico)
        System.out.println("a || b: " + (a || b));  // true, porque a é true

        // Operador ! (NOT Lógico)
        System.out.println("!a: " + (!a));  // false, porque a é true
        System.out.println("!b: " + (!b));  // true, porque b é false
    }
}
