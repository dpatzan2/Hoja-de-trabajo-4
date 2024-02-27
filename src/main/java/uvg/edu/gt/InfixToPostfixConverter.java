package uvg.edu.gt;

import java.util.Stack;

public class InfixToPostfixConverter {
    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> operatorStack = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char current = infix.charAt(i);
            if (isOperand(current)) {
                postfix.append(current);
            } else if (current == '(') {
                operatorStack.push(current);
            } else if (current == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    postfix.append(operatorStack.pop());
                }
                operatorStack.pop(); // Remove '('
            } else { // Operator
                while (!operatorStack.isEmpty() && precedence(operatorStack.peek()) >= precedence(current)) {
                    postfix.append(operatorStack.pop());
                }
                operatorStack.push(current);
            }
        }

        // Append remaining operators
        while (!operatorStack.isEmpty()) {
            postfix.append(operatorStack.pop());
        }

        return postfix.toString();
    }

    private static boolean isOperand(char c) {
        return Character.isLetterOrDigit(c);
    }

    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }
}
