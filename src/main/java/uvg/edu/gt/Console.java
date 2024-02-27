package uvg.edu.gt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Console {
    public static void showMenu(String filePath){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione la implementacion que desea para la pila");
        System.out.println("1. ArrayList");
        System.out.println("2. Vector");
        System.out.println("3. Lista");


        int option = scanner.nextInt();
        String stackType;
        String stackType2 = "";
        switch (option) {
            case 1:
                stackType = "ArrayList";
                break;
            case 2:
                stackType = "Vector";
                break;
            case 3:
                stackType = "Lista";
                stackType2 = getLinkedListType(scanner);
                break;
            default:
                System.out.println("Opción no válida. Se utilizará la implementación por defecto: ArrayList");
                stackType = "ArrayList";
        }

        Stack<Integer> stack = StackFactory.createStack(stackType, stackType2);

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("----------------------------------------------");
                System.out.println("Expresión infija: " + line);
                String postfix = InfixToPostfixConverter.infixToPostfix(line);
                System.out.println("Expresión posfija: " + postfix);
                System.out.println("----------------------------------------------");
                int result = evaluateExpression(line, stack);
                System.out.println(" ++ El resultado de la expresión " + line + " es: " + result);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo " + filePath + ": " + e.getMessage());
        }
    }

    private static int evaluateExpression(String expression, Stack<Integer> stack) {

        String postfix = InfixToPostfixConverter.infixToPostfix(expression);

        return ExpressionEvaluator.evaluatePostfix(postfix, stack);
    }

    private static String getLinkedListType(Scanner scanner) {
        System.out.println("Seleccione el tipo de lista para la implementación de lista:");
        System.out.println("1. Simplemente encadenada");
        System.out.println("2. Doblemente encadenada");

        int listChoice = scanner.nextInt();

        switch (listChoice) {
            case 1:
                return "simple";
            case 2:
                return "doble";
            default:
                System.out.println("Opción no válida. Se utilizará la lista simplemente encadenada por defecto.");
                return "SinglyLinkedList";
        }
    }

}
