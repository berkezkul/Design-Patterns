import strategies.move.Run;
import strategies.move.Walk;
import strategies.sound.SoundOfAnimal;

public class Cat extends Animal{
    public Cat(){
        soundStrategy = new SoundOfAnimal();
        addMoveStrategy(new Walk());
        addMoveStrategy(new Run());
    }
    @Override
    public void display() {
        System.out.println("Meow Meow");
    }
}
