import java.time.LocalDate;

public class ÜmmarguneKook extends Kook {
    private double läbimõõt;

    public ÜmmarguneKook(String koogiNimetus, LocalDate parimEnne, double ruutCMHind, double läbimõõt) {
        super(koogiNimetus, parimEnne, ruutCMHind);
        this.läbimõõt = läbimõõt;
    }

    @Override
    double pindala() {
        return Math.PI * Math.pow((läbimõõt / 2), 2);
    }


}
