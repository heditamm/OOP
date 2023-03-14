import java.util.Arrays;

public class Hekk {
    private String nimi;
    private Põõsas[] põõsad;

    public Hekk(String nimi, Põõsas[] põõsad) {
        this.nimi = nimi;
        this.põõsad = põõsad;
    }

    public double korgeim() {
        double max_korgus = 0.0;

        for (Põõsas p : põõsad) {
            if (p.getKõrgus() > max_korgus) {
                max_korgus = p.getKõrgus();
            }
        }
        return max_korgus;
    }

    public double hekiPikkus() {
        double summa = 0;

        for (Põõsas p : põõsad) {
            summa += p.getLaius();
        }
        return summa;
    }

    @Override
    public String toString() {
        return "Hekk{" +
                "nimi='" + nimi + '\'' +
                ", kõrgeim põõsas=" + korgeim() + ", heki pikkus= " + hekiPikkus() +
                '}';
    }
}
