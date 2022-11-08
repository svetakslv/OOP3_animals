package Animals;

public class herbivorous extends Mammals{
    private final String typeOfFood;

    public herbivorous(String name, int age, String livingEnvironment, int speedOfMovement, String typeOfFood) {
        super(name, age, livingEnvironment, speedOfMovement);
        this.typeOfFood = typeOfFood;
    }

    public void graze() {

    }
}
