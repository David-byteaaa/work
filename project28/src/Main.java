import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return name + " (" + age + ")";
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Alice", 25));
        list.add(new Person("Bob", 20));
        list.add(new Person("Charlie", 30));
        Collections.sort(list, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return p1.age - p2.age;
            }
        });
        System.out.println("按年龄升序排序结果：");
        for (Person p : list) {
            System.out.println(p);
        }
    }
}
