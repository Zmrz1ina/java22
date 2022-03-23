import java.util.Objects;

public class Animals19 implements Comparable {

    private String name;
    private int age;
    private String color;

    public Animals19(String name, int age, String color) {

        this.age = age;
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals19 animals19 = (Animals19) o;
        return age == animals19.age && Objects.equals(name, animals19.name) && Objects.equals(color, animals19.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color);
    }

    @Override
    public String toString() {
        return "Animals19{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {

        if (this == (Animals19) o) {
            return 0; // объекты равны
        }
        if (o == null || getClass() != o.getClass()) {
            throw new IllegalArgumentException("Несовпадение типов при сравнении объектов");
        }

        Animals19 animal1 = this;
        Animals19 animal2 = (Animals19) o;

        if (animal1.getAge() < animal2.getAge()) {
            return -1;
        }
        if (animal1.getAge() > animal2.getAge()) {
            return 1;
        }
        return 0;
    }
}
