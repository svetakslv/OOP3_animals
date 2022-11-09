package Animals;

public class birds extends animals{
    private final String livingEnvironment;

    public birds(String name, int age, String livingEnvironment) {
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
