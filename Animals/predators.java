package Animals;

public class predators extends Mammals{
    private final String typeOfFood;

    public predators(String name, int age, String livingEnvironment, int speedOfMovement, String typeOfFood) {
        super(name, age, livingEnvironment, speedOfMovement);
        this.typeOfFood = typeOfFood;
    }

    public void hunt() {

    }
}
