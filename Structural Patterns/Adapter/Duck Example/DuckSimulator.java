import java.util.ArrayList;
import java.util.List;

public class DuckSimulator {

    List<Duck> ducks = new ArrayList<>();
    public void add(Duck duck){
        ducks.add(duck);
    }


    public void flyAll(){
        for(Duck duck: ducks){
            duck.fly();
        }
    }

    public void quackAll(){
        for(Duck duck: ducks){
            duck.quack();
        }

    }
}
