package Animals;

public class Predators extends Mammals{
    private final String typeOfFood;

    public Predators(String name, int age, String livingEnvironment, int speedOfMovement, String typeOfFood) {
        super(name, age, livingEnvironment, speedOfMovement);
        if (typeOfFood == null) {
            this.typeOfFood = "мясо";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void hunt() {
        System.out.println("Я охочусь");
    }

    @Override
    public String toString() {
        return "отряд - хищники{" +
                "тип пищи: " + typeOfFood + ", скорость передвижения: " + speedOfMovement + ", возраст: " + age + '}';
    }

    public void printPredators() {
        System.out.println("Класс: хищник. Кличка животного: " + getName() + ", возраст: " + getAge() +
                ",место обитания: " + getLivingEnvironment() + " ,скорость передвижения: " + getSpeedOfMovement() + ",тип питания: " + getTypeOfFood());
    }
}
