package org.example.interpreter;

public class Client {
    static void main() {
        Expression left = new AddExpression(new NumberExpression(5), new NumberExpression(10));
        Expression subtract = new SubtractExpression(left, new NumberExpression(8));
        int result = subtract.interpret();
        System.out.println("Result: " + result); // Output: Result: 7
    }
}
