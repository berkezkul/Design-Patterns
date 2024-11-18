import strategies.move.Run;
import strategies.move.Walk;
import strategies.sound.SoundOfAnimal;

public class Dog extends Animal{
    public Dog(){
        soundStrategy = new SoundOfAnimal();
        addMoveStrategy(new Walk());
        addMoveStrategy(new Run());
    }
    @Override
    public void display() {
        System.out.println("Haw Haw");
    }
}

