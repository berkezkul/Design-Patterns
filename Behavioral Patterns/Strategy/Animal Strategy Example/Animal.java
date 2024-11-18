import strategies.move.MoveStrategy;
import strategies.sound.SilenceOfAnimal;
import strategies.sound.SoundOfAnimal;
import strategies.sound.SoundStrategy;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {

    SoundStrategy soundStrategy;
    //MoveStrategy moveStrategy;
    List<MoveStrategy> moveStrategies = new ArrayList<>();

    public Animal(){}

    public void performSound(){
        soundStrategy.sound();
    }

    //more than 1 has move
    public void performMove() {
        if (!moveStrategies.isEmpty()) {
            for (MoveStrategy moveStrategy : moveStrategies) {
                moveStrategy.move();
            }
        } else {
            System.out.println("No move strategies defined!");
        }
    }

    // Add a single move strategy
    public void addMoveStrategy(MoveStrategy moveStrategy) {
        moveStrategies.add(moveStrategy);
    }

    // Clear all move strategies
    public void clearMoveStrategies() {
        moveStrategies.clear();
    }


    abstract void display();

    //if want to change sound
    public void setSoundStrategy(SoundStrategy sound) {
        this.soundStrategy = sound;
    }

}
