package gerardcod.dev;

import java.util.List;

public class Application {

    public static void printNames() {
        List<String> names = List.of("Gerardo", "Roberto", "María", "Fernanda");
        names.forEach(System.out::println);
    }

    public static void main(String[] args) {
        System.out.println("Hello from Application");
    }
}
