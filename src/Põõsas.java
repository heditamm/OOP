import java.util.Random;

public class Põõsas {
    private double kõrgus;
    private double laius;

    public Põõsas(double kõrgus, double laius) {
        this.kõrgus = kõrgus;
        this.laius = laius;
    }

    public double getKõrgus() {
        return kõrgus;
    }

    public void setKõrgus(double kõrgus) {
        this.kõrgus = kõrgus;
    }

    public double getLaius() {
        return laius;
    }

    public void setLaius(double laius) {
        this.laius = laius;
    }

    public double aastajuurdekasv() {
        Random arv = new Random();
        double randomValue = 0.0 + 0.1 * arv.nextDouble();
        return getKõrgus() * randomValue;
    }

    @Override
    public String toString() {
        return "Põõsas{" +
                "kõrgus=" + kõrgus +
                ", laius=" + laius + ", prognoositav aastajuurdekasv=" + aastajuurdekasv() +
                '}';
    }
}
