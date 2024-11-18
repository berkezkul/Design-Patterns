import strategies.move.Swim;
import strategies.sound.SilenceOfAnimal;

public class Fish extends Animal {
    public Fish(){
        soundStrategy = new SilenceOfAnimal();
        addMoveStrategy(new Swim());
    }

    @Override
    public void display() {
        System.out.println("<<Silence>>");
    }
}
