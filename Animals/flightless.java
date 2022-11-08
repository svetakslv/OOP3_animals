package Animals;

public class flightless extends Birds{
    private final String typeOfMovement;

    public flightless(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);
        this.typeOfMovement = typeOfMovement;
    }

    public void walk() {

    }
}
