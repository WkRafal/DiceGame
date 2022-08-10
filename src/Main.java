import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int rzutKomp;
        int gracz;

        do {
            rzutKomp = random.nextInt(6) + 1;
            System.out.println("komputer wylosowal " + rzutKomp);
            gracz = random.nextInt(6) + 1;
            System.out.println("gracz wylosowal " + gracz);

            if (rzutKomp != gracz)
                System.out.println("przegrałes");;

        }while (rzutKomp != gracz);

        System.out.println("wygrałeś");
    }
}
