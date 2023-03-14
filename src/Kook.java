import java.text.DecimalFormat;
import java.time.LocalDate;

abstract class Kook implements Comparable<Kook> {
    private String koogiNimetus;
    private LocalDate parimEnne;
    private double ruutCMHind;

    public Kook(String koogiNimetus, LocalDate parimEnne, double ruutCMHind) {
        if (koogiNimetus.isEmpty()) {
            this.koogiNimetus = "The cake is a lie";
        } else {
            this.koogiNimetus = koogiNimetus;
        }
        this.parimEnne = parimEnne;
        this.ruutCMHind = ruutCMHind;
    }

    abstract double pindala();

    private DecimalFormat df = new DecimalFormat("0.00");

    double koogiHind() {
        String stringina = df.format((ruutCMHind * pindala()));
        return Double.parseDouble(stringina);
    }

    @Override
    public String toString() {
        return "Koogi nimi: " + koogiNimetus + ", koogi hind " + koogiHind() + ", koogi parim enne: " + parimEnne;
    }

    public int compareTo(Kook võrreldav) {
        return parimEnne.compareTo(võrreldav.parimEnne);
    }
}
