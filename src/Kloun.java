public class Kloun {
    private String nimi;

    public Kloun(String nimi) {
        this.nimi = nimi;
    }

    public void esine(KülastajaPraks külastaja) {
        külastaja.lisaKirjeldused("nägin klouni nimega " + nimi);
    }
}
