public class TuristiklassiReisija implements Reisija {
    private String reisijaNimi;
    private String lennuinfo;

    public TuristiklassiReisija(String reisijaNimi) {
        this.reisijaNimi = reisijaNimi;
    }

    @Override
    public double arvutaHind(double alghind) {
        return alghind;
    }

    @Override
    public void salvestaLennuinfo(String lennuinfo) {
        this.lennuinfo = lennuinfo;
    }

    @Override
    public String toString() {
        return "TuristiklassiReisija{" +
                "reisijaNimi='" + reisijaNimi + '\'' +
                ", lennuinfo='" + lennuinfo + '\'' +
                '}';
    }
}
