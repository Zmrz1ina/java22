import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Lesson17 {
    public static void main(String[] args) throws IOException {

        List<String> names = new ArrayList<>(100);

        names.add("Паша");
        names.add("Маша");
        names.add("Иван");

        ((ArrayList<String>) names).trimToSize();  // Освобождает свободные ячейки массива

        System.out.println("\n1ый вывод");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("\n2ой вывод");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println("\nУдаление Маши");
        names.remove("Маша");

        System.out.println("Поиск Маши");
        String userName = "Маша";
        System.out.println(names.contains(userName));

        System.out.println("\n0ой индекс - " + names.get(0));
        System.out.println("\n1ый индекс - " + names.get(1));

        List<Integer> numbers = Arrays.asList(1, 4, 5, 56, 97, 2);
        numbers.set(1, 20);

//                Iterator<Integer> iterator = numbers.iterator();
//        while (iterator.hasNext()) {
//
//            int n = (int) iterator.next();
//
//            if (n % 2 == 0) {
//                iterator.remove();
//            }
//            System.out.println();
//        }
        // НЕ работает со статичным массивом

        numbers.removeIf(x -> x % 2 == 0);

//        for (int number : numbers) {
//            if (number % 2 == 0) {
//
//                // так не работает
//                // numbers.remove(number);
//            }
//        }

        System.out.println("\n" + numbers);
        numbers.forEach(x -> {
            System.out.print(x * 2 + "  ");
        });
    }
}
