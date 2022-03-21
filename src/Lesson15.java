import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson15 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите возраст");

        String ageString = reader.readLine();

        Integer age;
        //if (ageString != null && ageString.isEmpty()){
        //    age = Integer.parseInt(ageString);
        //}

        try{
            age = Integer.parseInt(ageString);

        }catch (NumberFormatException ex){
            //throw new Exception("Возраст пуст !");
            //System.out.println("Возраст пуст !");
        }

        int x = 0;
        int mass[] = {1, 2, 3};

        try {
//            Cat cat = null;
//            cat.toString().charAt(3);
            mass[5]++;
            System.out.println(10 / x);

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException ex) {
            System.err.println("На ноль делить нельзя или " + ex);

        } catch (Exception ex) {
            System.err.println("хз эксепшн");

        }finally {

        }

        System.out.println("продолжние");
    }
}
