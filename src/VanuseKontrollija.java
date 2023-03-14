public class VanuseKontrollija implements Lõbustus {
    private int nõutudVanus;
    private Lõbustus delegaat;

    public VanuseKontrollija(int nõutudVanus, Lõbustus delegaat) {
        this.nõutudVanus = nõutudVanus;
        this.delegaat = delegaat;
    }

    @Override
    public void lõbusta(KülastajaPraks külastaja) {
        if (külastaja.getVanus() < nõutudVanus) {
            külastaja.lisaKirjeldused("külastaja ei läbinud vanusekontrolli");
        } else {
            delegaat.lõbusta(külastaja);
        }
    }
}
