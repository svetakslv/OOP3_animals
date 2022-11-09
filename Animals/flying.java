package Animals;

public class flying extends birds{
    private final String typeOfMovement;

    public flying(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);
        if (typeOfMovement == null || typeOfMovement.isEmpty()) {
            this.typeOfMovement = "полет";
        } else {
            this.typeOfMovement = typeOfMovement;
        }
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void fly() {
        System.out.println("Я летаю");
    }

    @Override
    public String toString() {
        return "летающие птицы{" +
                "способ передвижения: " + typeOfMovement + ", возраст: " + age + '}';
    }
    public void printFlying() {
        System.out.println("Летающие птицы. Кличка животного: " + getName() + ", возраст: " + getAge() +
                " ,тип передвижения: " + getTypeOfMovement());
    }
}
