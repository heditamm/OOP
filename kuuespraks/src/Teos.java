abstract class Teos implements Comparable<Teos> {
    private String teoseKirjeldus;
    String tähis;
    private String laenutaja;
    private int päevadeArv;

    public Teos(String teoseKirjeldus, String tähis, String laenutaja, int päevadeArv) {
        this.teoseKirjeldus = teoseKirjeldus;
        this.tähis = tähis;
        this.laenutaja = laenutaja;
        this.päevadeArv = päevadeArv;
    }

    abstract boolean kasHoidlast();

    int laenutusaeg() {
        return switch (tähis) {
            case "roheline" -> 1;
            case "sinine" -> 60;
            case "kollane" -> 30;
            case "puudub" -> 14;
            default -> 0;
        };
    }

    double päevaneViivis() {
        return switch (tähis) {
            case "sinine", "kollane" -> 0.05;
            case "roheline" -> 2;
            case "puudub" -> 0.15;
            default -> 0;
        };
    }

    void arvutaViivis(Kontrollija kontrollija) {
        int päevadÜle = päevadeArv - laenutusaeg();

        if (päevadÜle > 0) {
            double viivis = päevaneViivis() * päevadÜle;
            kontrollija.SalvestaViivis(laenutaja, teoseKirjeldus, viivis);
        }
    }

    @Override
    public String toString() {
        return "Teos{" +
                "teoseKirjeldus='" + teoseKirjeldus + '\'' +
                ", tähis='" + tähis + '\'' +
                ", laenutaja='" + laenutaja + '\'' +
                ", päevadeArv=" + päevadeArv +
                ", hoidlast=" + kasHoidlast() +
                '}';
    }

    public int compareTo(Teos teos) {
        return this.teoseKirjeldus.compareTo(teos.teoseKirjeldus);
    }
}
