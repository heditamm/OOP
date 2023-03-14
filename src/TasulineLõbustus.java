public class TasulineLõbustus implements Lõbustus{
    private double hind;
    private Lõbustus delegaat;

    public TasulineLõbustus(double hind, Lõbustus delegaat) {
        this.hind = hind;
        this.delegaat = delegaat;
    }

    @Override
    public void lõbusta(KülastajaPraks külastaja) {
        delegaat.lõbusta(külastaja);
        külastaja.lisaKulu(hind);
        System.out.println("tasusin külastuse eest "+hind);
    }
}
