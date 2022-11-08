package Animals;

public class flying extends Birds{
    private final String typeOfMovement;

    public flying(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);
        this.typeOfMovement = typeOfMovement;
    }

    public void fly() {

    }
}
