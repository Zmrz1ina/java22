import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Tasks18 {
    public static void main(String[] args) throws IOException {

        List<String> task1 = new LinkedList<>();
        task1.add("+375447499122");
        task1.add("+375293221300");
        task1.add("+375291060201");

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 3 номера телефона");

        List<String> task12 = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            task12.add(input.readLine());
        }
        task1.addAll(task12);
        System.out.println(task1);

        List<String> task2 = new ArrayList<>();
        task2.add("+375447499122");
        task2.add("+375293221300");
        task2.add("+375291060201");
        task2.add("+375446458525");
        task2.add("+375337323873");

        System.out.println("Введите индекс интересующего номера от 0 до 4");
        String resString = input.readLine();
        int resInt = Integer.parseInt(resString);
        for (int i = 0; i < 5; i++) {

            if (resInt == i) {
                System.out.println(task2.get(resInt));
            }

        }
    }
}
