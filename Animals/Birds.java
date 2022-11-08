package Animals;

public class Birds extends Animals{
    private final String livingEnvironment;

    public Birds(String name, int age, String livingEnvironment) {
        super(name, age);
        if (livingEnvironment.isEmpty()) {
            this.livingEnvironment = "Зоопарк";
        }else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public void hunt() {
        System.out.println("Я охочусь");
    }

    @Override
    public String toString() {
        return "Птицы" +
                "место обитания: " + livingEnvironment +", возраст: " + age;
    }
}
