import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Lesson19 {
    public static void main(String[] args) {

        HashSet<String> cities = new HashSet<>();
        cities.add("NY");
        cities.add("LA");
        cities.add("Minsk");
        cities.add("Brest");
        cities.add("Grodno");
        cities.add("Minsk");
        System.out.println(cities + "\n");
//////////////////////////////////////////////////////////////////
        Animals19 animal1 = new Animals19("Murzik", 300, "White");
        Animals19 animal2 = new Animals19("Persik", 2, "Gold");

        TreeSet<Animals19> animalTreeSet = new TreeSet<>();
        animalTreeSet.add(animal1);
        animalTreeSet.add(animal2);
        System.out.println(animalTreeSet + " - Sorting...\n");

        TreeSet<Animals19> animalTreeSet2 = new TreeSet<>(new AnimalsComparator19());

//////////////////////////////////////////////////////////////////
        HashSet<Animals19> animals = new HashSet<>();
        animals.add(new Animals19("Bob", 5, "Black"));
        animals.add(new Animals19("Murzik", 3, "White"));
        animals.add(new Animals19("Persik", 2, "Gold"));
        System.out.println(animals + "\n");
//////////////////////////////////////////////////////////////////
        LinkedHashSet<String> citiesLinkedHashSet = new LinkedHashSet<>();
        citiesLinkedHashSet.add("NY");
        citiesLinkedHashSet.add("LA");
        citiesLinkedHashSet.add("Minsk");
        citiesLinkedHashSet.add("Brest");
        citiesLinkedHashSet.add("Grodno");
        citiesLinkedHashSet.add("Minsk");
        System.out.println(citiesLinkedHashSet + "\n");
//////////////////////////////////////////////////////////////////
        TreeSet<String> namesTreeSet = new TreeSet<>();
        namesTreeSet.add("Ivan");
        namesTreeSet.add("Petya");
        namesTreeSet.add("Kirill");
        namesTreeSet.add("Ivan");
        namesTreeSet.add("Katya");
        System.out.println(namesTreeSet + "\n");
//////////////////////////////////////////////////////////////////
        ArrayList<Animals19> animalList = new ArrayList<>();
        animalList.sort(new AnimalsComparator19());
    }
}
