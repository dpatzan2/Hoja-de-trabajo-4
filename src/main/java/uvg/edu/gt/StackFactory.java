package uvg.edu.gt;


public class StackFactory {
    public static <T> Stack<T> createStack(String type, String type2) {
        switch (type) {
            case "ArrayList":
                return new ArrayListStack<>();
            case "Vector":
                return new VectorStack<>();
            case "Lista":
                return new LinkedListStack<>(type2);
            default:
                throw new IllegalArgumentException("Tipo de pila no válido: " + type);
        }
    }
}
