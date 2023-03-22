import java.util.ArrayList;
import java.util.List;

public class EsimeseKlassiReisija implements Reisija {
    private int kliendinumber;
    private List<String> lennuinfod = new ArrayList<>();

    public EsimeseKlassiReisija(int kliendinumber) {
        this.kliendinumber = kliendinumber;
    }

    @Override
    public double arvutaHind(double alghind) {
        return alghind * 1.5;
    }

    @Override
    public void salvestaLennuinfo(String lennuinfo) {
        lennuinfod.add(lennuinfo);
    }

    @Override
    public String toString() {
        return "EsimeseKlassiReisija{" +
                "kliendinumber=" + kliendinumber +
                ", lendude arv='" + lennuinfod.size() + '\'' +
                '}';
    }
}
