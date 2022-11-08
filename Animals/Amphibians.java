package Animals;

public class Amphibians extends Animals{
    private final String livingEnvironment;

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
    }

    public void hunt() {

    }
}
