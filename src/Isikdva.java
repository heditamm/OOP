public class Isikdva {
    private String nimi;
    private double pikkus;

    public Isikdva(String isikuNimi, double isikuPikkus) {
        nimi = isikuNimi;
        pikkus = isikuPikkus;
    }

    public int suusakepiPikkus() {
        return (int) Math.round(0.85 * pikkus * 100);
    }

    public static void main(String[] args) {
        Isikdva isik = new Isikdva("name", 1234);
        System.out.println("suusakepi pikkus on " + isik.suusakepiPikkus());
    }
}
