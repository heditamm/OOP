public class Programmeerija {
    private String programmeerijaNimi;
    private double riduKoodi;
    private int tasseKohvi;
    private Kohv lemmikkohv;

    public Programmeerija(String programmeerijaNimi, double riduKoodi, int tasseKohvi, Kohv lemmikkohv) {
        this.programmeerijaNimi = programmeerijaNimi;
        this.riduKoodi = riduKoodi;
        this.tasseKohvi = tasseKohvi;
        this.lemmikkohv = lemmikkohv;
    }

    public Programmeerija(String programmeerijaNimi, double riduKoodi) {
        this.programmeerijaNimi = programmeerijaNimi;
        this.riduKoodi = riduKoodi;
    }

    public static void main(String[] args) {

    }

    public double getRiduKoodi() {
        return riduKoodi;
    }

    public void setRiduKoodi(double riduKoodi) {
        this.riduKoodi = riduKoodi;
    }

    public int getTasseKohvi() {
        return tasseKohvi;
    }

    public void setTasseKohvi(int tasseKohvi) {
        this.tasseKohvi = tasseKohvi;
    }
    public boolean kasJoobKohvi(){
        if (lemmikkohv!=null){
            return true;
        }
        else {
            return false;
        }
    }
    public double koodiTassiKohta(){
        double kirjutamine = riduKoodi/tasseKohvi;
        if (tasseKohvi!=0){
            return kirjutamine;}
        else {
            return -1;
        }
    }

    @Override
    public String toString() {
        if (tasseKohvi!=0){
            return "Programmeerija{" +
                    "programmeerijaNimi='" + programmeerijaNimi + '\'' +
                    ", riduKoodi=" + riduKoodi +
                    ", tasseKohvi=" + tasseKohvi +
                    ", lemmikkohv=" + lemmikkohv.getKohvisort() +
                    ", tassihind=" + lemmikkohv.getHind()+
                    ", rahasumma=" + lemmikkohv.tassideMaksumus(tasseKohvi) +
                    ", koodiridu="+koodiTassiKohta()+
                    '}';}
        else {
            return "Programmeerija{"+"programmeerijaNimi="+programmeerijaNimi+" ei joo kohvi.";
        }
    }
}
