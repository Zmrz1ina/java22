import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Lesson18 {
    public static void main(String[] args) {

        LinkedList<String> n2 = new LinkedList<>();

        List<String> names = new LinkedList<>();
        names.add("Иван");
        names.add("Катя");
        names.add("Петя");
        names.add(0,"Оля");
        System.out.println(names);

        String[] mass = {"Миша", null, "Боря"};
        names.addAll(Arrays.asList(mass));

        n2.addFirst("Таня");
        n2.addLast("Пётр");
        n2.add("Катя");
        System.out.println(n2);

    }
}
