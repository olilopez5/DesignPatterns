package behaviorpatterns.interpreter;

import java.util.Stack;

public class NumberExpression implements Expression{

    private int number;


    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public void interpret(Stack<Integer> stack) {
        stack.push(number);

    }

    public int getNumber() {
        return number;
    }

    public NumberExpression setNumber(int number) {
        this.number = number;
        return this;
    }
}
