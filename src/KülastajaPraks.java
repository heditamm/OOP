import java.util.ArrayList;
import java.util.List;

//fail teise nimega, sest src juba on Külastaja fail ning ei taha seda ülekirjutada :)
public class KülastajaPraks {
    private int vanus;
    private double kulud;
    private List<String> külastuseKirjeldused;

    public KülastajaPraks() {
        this.külastuseKirjeldused = new ArrayList<>();
    }

    public int getVanus() {
        return vanus;
    }

    public KülastajaPraks(int vanus) {
        this.vanus = vanus;
        this.külastuseKirjeldused = new ArrayList<>();
    }

    void lisaKirjeldused(String kirjeldus) {
        külastuseKirjeldused.add(kirjeldus);
    }

    List<String> kõikKirjeldused() {
        return külastuseKirjeldused;

    }
    void lisaKulu(double kulu){
        this.kulud+=kulu;
    }
    double kuludeSumma(){
        return this.kulud;
    }
}
