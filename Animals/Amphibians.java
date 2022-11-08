package Animals;

public class Amphibians extends Animals{
    private final String livingEnvironment;

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        if (livingEnvironment.isEmpty()) {
            this.livingEnvironment = "Зоопарк";
        }else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void hunt() {
        System.out.println("Я охочусь");
    }

    @Override
    public String toString() {
        return "Земноводные" +
                "место обитания: " + livingEnvironment + ", возраст: " + age;
    }
    public void printAmphibians() {
        System.out.println("Земноводные. Кличка животного: " + getName() + ", возраст: " + getAge() +
                ",место обитания: " + getLivingEnvironment());
    }
}
