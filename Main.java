import Animals.*;


public class  Main {


    public Main() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {

        Herbivorous gazelle = new Herbivorous("Эльза", 4, "Африка", 50, "трава");
        Herbivorous giraffe = new Herbivorous("Мелман", 10, "Африка", 55, "акация");
        Herbivorous horse = new Herbivorous("Гром", 5, "Северная Америка", 66, "трава");

        Predators hyena = new Predators("Шензи", 12, "Африка", 150, "копытные, падаль");
        Predators tiger = new Predators("Шерхан", 15, "Индонезия", 65, "копытные");
        Predators bear = new Predators("Балу", 24, "Аляска", 60, "всеядный");

        Amphibians frog = new Amphibians("Чарльз", 1, "Азия");
        Amphibians snake = new Amphibians("Иван", 2, "Россия");

        Flightless peacock = new Flightless("Франциск", 3, "Шри-Ланка", "ходьба");
        Flightless penguin = new Flightless("Шкипер", 30, "Новая Зеландия", "плвание, ходьба");
        Flightless dodoBird = new Flightless("Йорик", 7, "Маврикий", "ходьба");

        Flying seagull = new Flying("Скаттл", 42, "Дания", "полет, ходьба, плавание");
        Flying albatross = new Flying("Павел", 45, "Антарктида", "полет, ходьба, плавание");
        Flying falcon = new Flying("Ясень", 16, "Тайга", "полет, ходьба");

        gazelle.printHerbivorous();
        giraffe.printHerbivorous();
        horse.printHerbivorous();
        System.out.println();

        hyena.printPredators();
        tiger.printPredators();
        bear.printPredators();
        System.out.println();

        frog.printAmphibians();
        snake.printAmphibians();
        System.out.println();

        peacock.printFlightless();
        penguin.printFlightless();
        dodoBird.printFlightless();
        System.out.println();

        seagull.printFlying();
        albatross.printFlying();
        falcon.printFlying();
    }
}