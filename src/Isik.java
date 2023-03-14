import static java.lang.Math.round;

public class Isik {
    private String nimi;
    private double pikkus;
    private String isikukood;
    private double mass;

    public Isik(String nimi, double pikkus, String isikukood, double mass) {
        this.nimi = nimi;
        this.pikkus = pikkus;
        this.isikukood = isikukood;
        this.mass = mass;
    }

    public static void main(String[] args) {
        Isik a = new Isik("Juhan Juurikas", 1.99, "60310102716", 60);
        System.out.println("Isik a on " + a);//prindib objekti välja sest objekt a ei kuulu Java standardobjektida hulka
        System.out.println(a.toString());
        System.out.println(a);
        System.out.println(a.kmi(a.mass, a.pikkus, 18));
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public double getPikkus() {

        return pikkus;
    }

    public void setPikkus(double pikkus) {
        this.pikkus = pikkus;
    }

    public String getIsikukood() {
        return isikukood;
    }

    public void setIsikukood(String isikukood) {
        this.isikukood = isikukood;
    }

    public double getMass() {
        return (int) mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public String kmi(double mass, double pikkus, int vanus) {
        double indeks = round(mass / (pikkus * pikkus));
        return this.getNimi() + " oled " + vanus + "-aastat vana ning su kmi on " + indeks;
    }

    @Override
    public String toString() {
        return "Isik{" +
                "nimi='" + nimi + '\'' +
                ", pikkus=" + pikkus +
                ", isikukood='" + isikukood + '\'' +
                ", mass=" + mass +
                '}';
    }
}
