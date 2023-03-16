public class Ajakiri extends Teos {
    public Ajakiri(String teoseKirjeldus, String tähis, String laenutaja, int päevadeArv) {
        super(teoseKirjeldus, tähis, laenutaja, päevadeArv);
    }

    @Override
    boolean kasHoidlast() {
        int ilmumine = Integer.parseInt(teoseKirjeldus.substring(teoseKirjeldus.indexOf("/") + 1, teoseKirjeldus.indexOf(", ")));
        return ilmumine <= 2000;
    }

    @Override
    public String toString() {
        return super.toString() + " on ajakiri.";
    }
}
