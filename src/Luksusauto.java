import java.time.LocalDate;

public class Luksusauto extends Auto {
    private int tootmisaasta;

    public Luksusauto(String omanikuNimi, String automudel, boolean elektriauto, int tootmisaasta) {
        super(omanikuNimi, automudel, elektriauto);
        this.tootmisaasta = tootmisaasta;
    }

    @Override
    double arvutaParanduseMaksumus(double aegH) {
        int aasta = LocalDate.now().getYear();
        if ((aasta-tootmisaasta)>70)
            return super.arvutaParanduseMaksumus(aegH)*15;
        return super.arvutaParanduseMaksumus(aegH)*10;
    }

    @Override
    String autoliik() {
        return "Luksusauto";
    }

    /*public static void main(String[] args) {
        Luksusauto luksus = new Luksusauto("aa", "ab", true, 1953);
        System.out.println(luksus.arvutaParanduseMaksumus(1.0));
    }*/
}
