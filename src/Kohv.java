public class Kohv {
    private String kohvisort;
    private double hind;

    public Kohv(String kohvisort, double hind) {
        this.kohvisort = kohvisort;
        this.hind = hind;
    }

    public static void main(String[] args) {
        Kohv kohvi = new Kohv("espresso", 3.5);
        System.out.println(kohvi.tassideMaksumus(4));
    }

    public String getKohvisort() {
        return kohvisort;
    }

    public double getHind() {
        return hind;
    }
    public double tassideMaksumus(int tasside_arv){
        double maksumus = tasside_arv*hind;
        return maksumus;
    }

}
