import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.compare;

public class Lend implements Comparable<Lend> {
    private String sihtkoht;
    private double piletiAlghind;
    private List<Reisija> reisijad = new ArrayList<>();
    private double piletiteEestSumma = 0;

    public Lend(String sihtkoht, double piletiAlghind) {
        this.sihtkoht = sihtkoht;
        this.piletiAlghind = piletiAlghind;
    }

    String vormindaLennuinfo() {
        return "Lend: sihtkoht - " + sihtkoht;
    }

    void transpordiReisija(Reisija reisija) {
        reisijad.add(reisija);
        piletiteEestSumma += reisija.arvutaHind(piletiAlghind);
        reisija.salvestaLennuinfo(vormindaLennuinfo());
    }

    void väljastaReisijad() {
        System.out.println(reisijad);
    }

    @Override
    public String toString() {
        return "Lend{" +
                "sihtkoht='" + sihtkoht + '\'' +
                ", piletiteEestSumma=" + piletiteEestSumma +
                '}';
    }

    public int compareTo(Lend lend) {
        return this.piletiteEestSumma != lend.piletiteEestSumma ? compare(this.piletiteEestSumma, lend.piletiteEestSumma) : 0;
    }
}
