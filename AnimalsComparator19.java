import java.util.Comparator;

public class AnimalsComparator19 implements Comparator<Animals19> {
    @Override
    public int compare(Animals19 o1, Animals19 o2) {
        if (o1 == o2){
            return 0;
        }
        if (o1 == null || o2 == null){
            throw new IllegalArgumentException("Несовпадение типов при сравнении объектов");
        }

        Integer age1 = o1.getAge();
        Integer age2 = o2.getAge();
        return age1.compareTo(age2);
    }
}
