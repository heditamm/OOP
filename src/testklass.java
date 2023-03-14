public class testklass {
    public static void main(String[] args) {
        Seade raadio = new Seade(123, "raadio", 100);
        System.out.println(raadio.toString());

        Lennuk fokker = new Lennuk("Fokker F50", 530, 46);
        Lennuk bn = new Lennuk("BN-2", 170, 9);

        Reis paris = new Reis("Paris", 1900, fokker, 5);
        Reis london = new Reis("London", 1861, fokker, 9);
        Reis guadeloupe = new Reis("Gueadeloupe", 10133, bn, 2);

        System.out.println("Lend " + paris.getSihtpunkt() + "i kestab " + paris.KestvusMinutites() + " minutit.");
        System.out.println("Lennukis on " + paris.VabadKohad() + " vaba kohta.");
        System.out.println("Lend " + london.getSihtpunkt() + "i kestab " + london.KestvusMinutites() + " minutit.");
        System.out.println("Lennukis on " + london.VabadKohad() + " vaba kohta.");
        System.out.println("Lend " + guadeloupe.getSihtpunkt() + "i kestab " + guadeloupe.KestvusMinutites() + " minutit.");
        System.out.println("Lennukis on " + guadeloupe.VabadKohad() + " vaba kohta.");

        Põõsas põõsas1 = new Põõsas(3.4, 1.5);
        Põõsas põõsas2 = new Põõsas(1.4, 2.5);
        Põõsas põõsas3 = new Põõsas(3.7, 1.1);
        Põõsas põõsas4 = new Põõsas(2.5, 0.6);
        Põõsas põõsas5 = new Põõsas(3.0, 1.0);

        Põõsas[] põõsad = new Põõsas[5];

        põõsad[0] = põõsas1;
        põõsad[1] = põõsas2;
        põõsad[2] = põõsas3;
        põõsad[3] = põõsas4;
        põõsad[4] = põõsas5;

        Hekk hekk = new Hekk("Nõo", põõsad);
        System.out.println(hekk.toString());
        for (Põõsas poosas : põõsad) {
            System.out.println(poosas.toString());
        }
    }
}
