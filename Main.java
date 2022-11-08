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

        herbivorous gazelle = new herbivorous("Эльза", 4, "Африка", 50, "трава");
        herbivorous giraffe = new herbivorous("Мелман", 10, "Африка", 55, "акация");
        herbivorous horse = new herbivorous("Гром", 5, "Северная Америка", 66, "трава");

        predators hyena = new predators("Шензи", 12, "Африка", 150, "копытные, падаль");
        predators tiger = new predators("Шерхан", 15, "Индонезия", 65, "копытные");
        predators bear = new predators("Балу", 24, "Аляска", 60, "всеядный");

        Amphibians frog = new Amphibians("Чарльз", 1, "Азия");
        Amphibians snake = new Amphibians("Иван", 2, "Россия");

        flightless peacock = new flightless("Франциск", 3, "Шри-Ланка", "ходьба");
        flightless penguin = new flightless("Шкипер", 30, "Новая Зеландия", "плвание, ходьба");
        flightless dodoBird = new flightless("Йорик", 7, "Маврикий", "ходьба");

        flying seagull = new flying("Скаттл", 42, "Дания", "полет, ходьба, плавание");
        flying albatross = new flying("Павел", 45, "Антарктида", "полет, ходьба, плавание");
        flying falcon = new flying("Ясень", 16, "Тайга", "полет, ходьба");

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