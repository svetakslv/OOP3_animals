package Animals;

public class herbivorous extends mammals {
    private final String typeOfFood;

    public herbivorous(String name, int age, String livingEnvironment, int speedOfMovement, String typeOfFood) {
        super(name, age, livingEnvironment, speedOfMovement);
        if (typeOfFood == null) {
            this.typeOfFood = "трава";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }


    public void graze() {
        System.out.println("Я пасусь");
    }

    @Override
    public String toString() {
        return "отряд - травоядные{" +
                "тип пищи: " + typeOfFood + ", скорость передвижения: " + speedOfMovement + ", возраст" + age + '}';
    }

    public void printHerbivorous() {
        System.out.println("Класс: травоядное. Кличка животного: " + getName() + ", возраст: " + getAge() +
                ",место обитания: " + getLivingEnvironment() + " ,скорость передвижения: " + getSpeedOfMovement() + ",тип питания: " + getTypeOfFood());
    }
}
