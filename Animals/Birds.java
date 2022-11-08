package Animals;

public class Birds extends Animals{
    private final String livingEnvironment;

    public Birds(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
    }

    public void hunt() {

    }
}
