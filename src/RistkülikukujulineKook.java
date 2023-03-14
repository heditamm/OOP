import java.time.LocalDate;

public class RistkülikukujulineKook extends Kook {
    private double pikkus;
    private double laius;

    public RistkülikukujulineKook(String koogiNimetus, LocalDate parimEnne, double ruutCMHind, double pikkus, double laius) {
        super(koogiNimetus, parimEnne, ruutCMHind);
        this.pikkus = pikkus;
        this.laius = laius;
    }

    @Override
    double pindala() {
        return pikkus * laius;
    }


}
