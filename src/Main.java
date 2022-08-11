import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Player player = new Player();

        Random random = new Random();
        int rzutKomp;
        int gracz;

        do {
            rzutKomp = random.nextInt(6) + 1;
            System.out.println("komputer wylosowal " + rzutKomp);
            gracz = player.guess();
            System.out.println("gracz wylosowal " + gracz);

            if (rzutKomp != gracz)
                System.out.println("przegrałes");;

        }while (rzutKomp != gracz);

        System.out.println("wygrałeś");
    }
}
