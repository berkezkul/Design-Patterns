package strategies.move;

public class Swim implements MoveStrategy{
    @Override
    public void move() {
        System.out.println("Animal can swim");
    }
}
