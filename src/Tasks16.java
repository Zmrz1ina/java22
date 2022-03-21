public class Tasks16 {
    public static void main(String[] args) {

        int counter = 0;

        for (int i = 2; i < 101; i++) {

            for (int j = 1; j < 101; j++) {

                if (i / j == i && i / j == 1) {
                    counter++;
                    System.out.println(i);
                }
            }
        }

        System.out.println(counter);
    }
}

