import java.util.Random;

public class Player {

    private Random rand = new Random();

    public int guess(){
        return rand.nextInt(6) + 1;
    }
}
