public class Auto {
    private String omanikuNimi;
    private String automudel;
    private boolean elektriauto;

    public Auto(String omanikuNimi, String automudel, boolean elektriauto) {
        this.omanikuNimi = omanikuNimi;
        this.automudel = automudel;
        this.elektriauto = elektriauto;
    }

    double arvutaParanduseMaksumus(double aegH) {
        if (elektriauto) {
            return 36 * aegH;
        }
        return 40 * aegH;
    }

    String autoliik() {
        return "Sõiduauto";
    }

    @Override
    public String toString() {
        return autoliik() + ". Mudel: " + automudel + "; omanik: " + omanikuNimi;
    }
}
