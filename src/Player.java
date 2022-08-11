import java.util.Random;

public class Player {

    private Random rand = new Random();
    private String name = "janusz";

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty())
            this.name = name;
        else
            System.err.println("Nieprawidłowe imię");
    }

    public int guess(){
        return rand.nextInt(6) + 1;
    }
}
