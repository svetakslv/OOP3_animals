package Animals;

public class Mammals extends Animals{
    private final String livingEnvironment;
    protected int speedOfMovement;

    public Mammals(String name, int age, String livingEnvironment, int speedOfMovement) {
        super(name, age);
        if (livingEnvironment.isEmpty()) {
            this.livingEnvironment = "Зоопарк";
        }else {
            this.livingEnvironment = livingEnvironment;
        }
        if (speedOfMovement <= 0) {
            this.speedOfMovement = 0;
        } else {
            this.speedOfMovement = speedOfMovement;
        }
    }
    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public int getSpeedOfMovement() {
        return speedOfMovement;
    }

    public void setSpeedOfMovement(int speedOfMovement) {
        if (speedOfMovement <= 0) {
            this.speedOfMovement = 0;
        } else {
            this.speedOfMovement = speedOfMovement;
        }
    }


    public void walking() {
        System.out.println("Я гуляю");
    }

    @Override
    public String toString() {
        return "Млекопитающие, " +
                "место обитания: " + livingEnvironment + ", скорость передвижения: " + speedOfMovement + " км/ ч" +
                ", возраст: " + age;
    }

}
