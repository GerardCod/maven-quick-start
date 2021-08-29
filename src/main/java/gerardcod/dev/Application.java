package gerardcod.dev;

import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {

    public static void printNames() {
        List<String> names = List.of("Gerardo", "Roberto", "María", "Fernanda");
        names.forEach(System.out::println);
    }

    public int countWords(String text) {
        String[] words = StringUtils.split(text, ' ');
        return (words == null) ? 0 : words.length;
    }

    public static void main(String[] args) {
        System.out.println("Hello from Application");
        Application app = new Application();
        int count = app.countWords("I have fout words");
        System.out.println("Words: " + count);
    }
}
