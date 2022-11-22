package DZ_6;

import java.util.HashSet;
import java.util.Set;

public class Cat {
    private final int id;
    private final String name;
    private double age;
    private final String sex;

    public Cat (int id, String name, double age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return  "name = " + name + ", age = " + age + ", sex = " + sex + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat anotherCat = (Cat) o;
        return ((this.id == anotherCat.id) && (this.name.equals(anotherCat.name)) && (this.age == anotherCat.age) && (this.sex.equals(anotherCat.sex)));
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    public static void main(String[] args) {
        Set<Cat> catBase = new HashSet<>();

        catBase.add(new Cat(1, "Barsik", 3, "male"));
        catBase.add(new Cat(1, "Barsik", 3, "male"));
        catBase.add(new Cat(3, "Pusha", 1, "female"));
        catBase.add(new Cat(1, "Barsik", 3, "male"));
        catBase.add(new Cat(5, "Kisa", 0.5, "female"));
        System.out.println(catBase.toString());
    }
}
