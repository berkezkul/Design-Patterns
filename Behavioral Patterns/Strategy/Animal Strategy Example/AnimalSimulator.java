public class AnimalSimulator {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.performSound();
        cat.display();
        cat.performMove();

        Animal fish = new Fish();
        fish.performSound();
        fish.display();
        fish.performMove();
    }
}
