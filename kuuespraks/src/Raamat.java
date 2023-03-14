public class Raamat extends Teos {

    public Raamat(String teoseKirjeldus, String tähis, String laenutaja, int päevadeArv) {
        super(teoseKirjeldus, tähis, laenutaja, päevadeArv);
    }

    @Override
    boolean kasHoidlast() {
        return super.tähis.equals("kollane") || super.tähis.equals("sinine");
    }

    @Override
    public String toString() {
        return super.toString() + " on raamat.";
    }
}
