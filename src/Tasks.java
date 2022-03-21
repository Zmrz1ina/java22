import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tasks {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число"); // 10+7+4+6

        String ageString = reader.readLine();

        Integer age = null;
        int result = 0;

        for (int i = 0; i < ageString.length(); i++) {

            char letter = ageString.charAt(i);
            if (Character.isDigit(letter)) {
                result += ageString.charAt(i);
            } else if (ageString.charAt(i) == '+') {
                continue;
            } else {
                System.out.println("Введены неправельные символы");
            }
            System.out.println("result: " + result);
        }

//        try {
//            age = Integer.parseInt(ageString);
//
//        } catch (NumberFormatException ex) {
//            System.out.println("Слишком большое число!");
//        }
//        System.out.println("Твое число - " + age);
//    }
    }
}
