public class Autoteenindus {
    private int parandatudAutod;
    private double teenitudKulu;

    void paranda(Auto auto, double kulutatudAeg) {
        double maksumus = auto.arvutaParanduseMaksumus(kulutatudAeg);
        System.out.println(auto.toString() + " remondi hind: " + maksumus);
        parandatudAutod += 1;
        teenitudKulu += maksumus;
    }

    @Override
    public String toString() {
        return "Autoteeninduses parandatud autode arv: " + parandatudAutod +
                ", teenitud tulu: " + teenitudKulu;
    }
}
