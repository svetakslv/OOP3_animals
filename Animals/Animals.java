package Animals;

import java.util.Objects;

public class Animals {
    private String name;
    public int age;

    public Animals(String name, int age) {
        this.name = name;
        if (age == 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age == 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public void eat() {
        System.out.println("Я питаюсь");
    }
    public void sleep() {
        System.out.println("Я сплю");
    }
    public void move() {
        System.out.println("Я двигаюсь");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animals)) return false;
        Animals animals = (Animals) o;
        return Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Кличка животного:" + name + ", возраст: " + age;
    }

    }


