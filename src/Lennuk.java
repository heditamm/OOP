public class Lennuk {
    private String nimi;
    private double keskmineKiirus;
    private int maxReisijateArv;

    public Lennuk(String nimi, double keskmineKiirus, int maxReisijateArv) {
        this.nimi = nimi;
        this.keskmineKiirus = keskmineKiirus;
        this.maxReisijateArv = maxReisijateArv;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public double getKeskmineKiirus() {
        return keskmineKiirus;
    }

    public void setKeskmineKiirus(double keskmineKiirus) {
        this.keskmineKiirus = keskmineKiirus;
    }

    public int getMaxReisijateArv() {
        return maxReisijateArv;
    }

    public void setMaxReisijateArv(int maxReisijateArv) {
        this.maxReisijateArv = maxReisijateArv;
    }

    @Override
    public String toString() {
        return "Lennuk{" +
                "nimi='" + nimi + '\'' +
                ", keskmineKiirus=" + keskmineKiirus +
                ", maxReisijateArv=" + maxReisijateArv +
                '}';
    }
}
