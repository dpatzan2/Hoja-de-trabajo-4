package uvg.edu.gt;

import java.util.Scanner;

public class Console {
    public static void showMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione la implementacion que desea para la pila");
        System.out.println("1. ArrayList");
        System.out.println("2. Vector");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Esta opcion no existe, se usara la implementacion por defecto: ArrayList");
        }

        Stack
    }

}
