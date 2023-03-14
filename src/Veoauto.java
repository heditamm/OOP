public class Veoauto extends Auto {
    private boolean isik;

    public Veoauto(String omanikuNimi, String automudel, boolean elektriauto, boolean isik) {
        super(omanikuNimi, automudel, elektriauto);
        this.isik = isik;
    }

    @Override
    double arvutaParanduseMaksumus(double aegH) {
        if (isik) {
            return (super.arvutaParanduseMaksumus(aegH)) * 2;
        }
        return (super.arvutaParanduseMaksumus(aegH)) * 3;
    }

    @Override
    String autoliik() {
        return "Veoauto";
    }
}
