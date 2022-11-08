package Animals;

public class Mammals extends Animals{
    private final String livingEnvironment;
    protected int speedOfMovement;

    public Mammals(String name, int age, String livingEnvironment, int speedOfMovement) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
        this.speedOfMovement = speedOfMovement;
    }

    public void walking() {

    }
}
