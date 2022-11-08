package Animals;

public class flightless extends Birds{
    private final String typeOfMovement;

    public flightless(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);
        if (typeOfMovement == null || typeOfMovement.isEmpty()) {
            this.typeOfMovement = "ходьба";
        } else {
            this.typeOfMovement = typeOfMovement;
        }
    }
    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void walk() {
        System.out.println("Я гуляю");
    }

    @Override
    public String toString() {
        return "нелетающие птицы{" +
                "способ передвижения: " + typeOfMovement + ", возраст: " + age + '}';
    }
    public void printFlightless() {
        System.out.println("Нелетающие птицы. Кличка животного: " + getName() + ", возраст: " + getAge() +
                " ,тип передвижения: " + getTypeOfMovement());
    }
}
