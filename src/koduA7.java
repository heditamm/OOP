import java.util.Scanner;
import static java.lang.Math.round;


public class koduA7 {
    public static void main(String[] args) {
        Scanner nim = new Scanner(System.in);
        System.out.println("Sisesta nimi: ");
        String nimi = nim.nextLine();
        Scanner kg = new Scanner(System.in);
        System.out.println("Sisesta kaal täisarvuna: ");
        int kaal = kg.nextInt();
        Scanner pikk = new Scanner(System.in);
        System.out.println("Sisesta pikkus meetrites: ");
        double pikkus = pikk.nextFloat();

        int kmi = (int) round(kaal/(pikkus*pikkus));
        if (kmi>25){
            System.out.println(nimi + " kasva pikemaks");
        }
        if (kmi < 18.6){
            System.out.println(nimi + " söö rohkem");
        }
        else
            System.out.println(nimi + " sa oled normaalkaalus");

    }

}
