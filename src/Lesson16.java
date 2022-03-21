import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson16 {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число от 1 до 999"); // 10+7+4+6

        String num = input.readLine();

        int res = 0;

        try {
            res = Integer.parseInt(num);

        } catch (NumberFormatException ex) {

            System.out.println("Не число!");
        }

        if (res < 1 || res > 999) {
            System.out.println("неправ число!");
            throw new IllegalArgumentException("Число вне диапазаона!");
        } else {

            if (res % 2 == 0) {
                System.out.print("Число четное! ");

                if (res >= 100) {
                    System.out.println("Трехзначное!");

                } else if (res >= 10 && res <= 99) {
                    System.out.println("Двузначное!");

                } else if (res <= 9) {
                    System.out.println("Однозначное!");

                }
            } else {
                System.out.print("Число нечетное! ");

                if (res >= 100) {
                    System.out.println("Трехзначное!");

                } else if (res >= 10 && res <= 99) {
                    System.out.println("Двузначное!");

                } else if (res <= 9) {
                    System.out.println("Однозначное!");

                }
            }
        }
    }

}

