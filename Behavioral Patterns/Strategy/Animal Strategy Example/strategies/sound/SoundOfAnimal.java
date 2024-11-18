package strategies.sound;

public class SoundOfAnimal implements SoundStrategy{

    @Override
    public void sound() {
        System.out.println("Animal has a sound");
    }
}
