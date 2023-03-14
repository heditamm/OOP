public class Seade {

    private int kood;
    private String nimetus;
    private double KMtaHind;
    static double protsent = 20;

    public Seade(int kood, String nimetus, double KMtaHind) {
        this.kood = kood;
        this.nimetus = nimetus;
        this.KMtaHind = KMtaHind;
    }

    public int getKood() {
        return kood;
    }

    public void setKood(int kood) {
        this.kood = kood;
    }

    public String getNimetus() {
        return nimetus;
    }

    public void setNimetus(String nimetus) {
        this.nimetus = nimetus;
    }

    public double getKMtaHind() {
        return KMtaHind;
    }

    public void setKMtaHind(double KMtaHind) {
        this.KMtaHind = KMtaHind;
    }

    public double kmhind() {
        return getKMtaHind() + (getKMtaHind() * (protsent / 100));
    }

    @Override
    public String toString() {
        return "Seade{" +
                "kood=" + kood +
                ", nimetus='" + nimetus + '\'' +
                ", KMtaHind=" + KMtaHind
                + ", KMga hind=" + kmhind() +
                '}';
    }
}
