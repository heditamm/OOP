public class RahvusvahelineLend extends Lend {
    private String sihtkohaRiik;

    public RahvusvahelineLend(String sihtkoht, double piletiAlghind, String sihtkohaRiik) {
        super(sihtkoht, piletiAlghind);
        this.sihtkohaRiik = sihtkohaRiik;
    }

    @Override
    String vormindaLennuinfo() {
        return super.vormindaLennuinfo() + ", sihtkoha riik - " + sihtkohaRiik;
    }
}
