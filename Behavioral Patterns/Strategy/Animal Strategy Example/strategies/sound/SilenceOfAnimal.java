package strategies.sound;

public class SilenceOfAnimal implements SoundStrategy{
    @Override
    public void sound() {
        System.out.println("Animal has not sound");
    }
}
