public class Limusiin extends Luksusauto {


    public Limusiin(String omanikuNimi, String automudel, boolean elektriauto, int tootmisaasta) {
        super(omanikuNimi, automudel, elektriauto, tootmisaasta);
    }

    @Override
    double arvutaParanduseMaksumus(double aegH) {
        return (super.arvutaParanduseMaksumus(aegH)) * 1.5;
    }

    @Override
    String autoliik() {
        return "Limusiin";
    }
}
