import java.time.LocalDate;

public class Õpilaspilet implements Dokument{
    private int sünniaasta;

    public Õpilaspilet(int sünniaasta) {
        this.sünniaasta = sünniaasta;
    }
    public boolean vanusOnVähemalt(int x) {
        int praeguneAasta = LocalDate.now().getYear();
        return sünniaasta <= praeguneAasta-x;
    }

    @Override
    public String toString() {
        return "Õpilaspilet{" +
                "sünniaasta=" + sünniaasta +
                '}';
    }
}
