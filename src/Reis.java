public class Reis {
    private String sihtpunkt;
    private int kaugus;
    private Lennuk lennuk;
    private int myydudPiletid;

    public Reis(String sihtpunkt, int kaugus, Lennuk lennuk, int myydudPiletid) {
        this.sihtpunkt = sihtpunkt;
        this.kaugus = kaugus;
        this.lennuk = lennuk;
        this.myydudPiletid = myydudPiletid;
    }

    public String getSihtpunkt() {
        return sihtpunkt;
    }

    public int getKaugus() {
        return kaugus;
    }

    public Lennuk getLennuk() {
        return lennuk;
    }

    public int getMyydudPiletid() {
        return myydudPiletid;
    }

    public int KestvusMinutites() {
        return (int) ((getKaugus() / lennuk.getKeskmineKiirus()) * 60);
    }

    public int VabadKohad() {
        return lennuk.getMaxReisijateArv() - getMyydudPiletid();
    }

    @Override
    public String toString() {
        return "Reis{" +
                "sihtpunkt='" + sihtpunkt + '\'' +
                ", kaugus=" + kaugus +
                ", lennuk=" + lennuk +
                ", myydudPiletid=" + myydudPiletid +
                '}';
    }
}
