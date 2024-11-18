package strategies.move;

public class Walk implements MoveStrategy{
    @Override
    public void move() {
        System.out.println("Animal can walk");
    }
}
