package uvg.edu.gt;

public class ExpressionEvaluator {
    public static int evaluatePostfix(String postfix, Stack<Integer> operandStack) {
        for (int i = 0; i < postfix.length(); i++) {
            char current = postfix.charAt(i);
            if (Character.isDigit(current)) {
                operandStack.push(current - '0');
            } else {
                int operand2 = operandStack.pop();
                int operand1 = operandStack.pop();
                int result = performOperation(current, operand1, operand2);
                operandStack.push(result);
            }
        }
        return operandStack.pop();
    }

    private static int performOperation(char operator, int operand1, int operand2) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("División por cero");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Operador no válido: " + operator);
        }
    }
}
