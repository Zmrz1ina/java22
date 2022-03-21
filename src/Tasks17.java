import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tasks17 {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 5 чисел");

        List<Integer> numbers = new ArrayList<>();
        int res = 0;

        for (int i = 0; i < 5; i++){

            String numString = input.readLine();
            res = Integer.parseInt(numString);
            numbers.add(res);

        }

        System.out.println(numbers + "\n");

        System.out.println("Выбирай : ");
        System.out.println("1 - Добавить элемент ");
        System.out.println("2 - Удалить элемент ");
        System.out.println("3 - Показать список ");
        System.out.println("4 - Проверить на опред. значение ");
        System.out.println("5 - Заменить значение ");


        String choice1 = input.readLine();
        int choice2 = Integer.parseInt(choice1);
        switch (choice2)
        {
            case 1 :
                System.out.println("Введите добовляемое значение :");
                String elem = input.readLine();
                res = Integer.parseInt(elem);
                numbers.add(res);
                System.out.println(numbers);
                break;
       }
    }
}
