package behaviorpatterns.interpreter;

public class TestInterpreter {
    public static void main(String[] args) {
        //notacion polaca
        String str = "5 1 2 + 4 * + 3 -";
        System.out.println("Result: " + new Interpreter(str).evaluate());

    }
}
