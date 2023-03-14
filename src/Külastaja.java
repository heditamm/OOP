public class Külastaja implements Comparable<Külastaja> {
    public int compareTo(Külastaja võrreldav) {
        return Integer.compare(võrreldav.külastatudArv, külastatudArv);

    }

    private String nimi;
    private int külastatudArv;

    public Külastaja(String nimi, int külastatudArv) {
        this.nimi = nimi;
        this.külastatudArv = külastatudArv;
    }

    public String getNimi() {
        return nimi;
    }

    public int getKülastatudArv() {
        return külastatudArv;
    }

    @Override
    public String toString() {
        return "Külastaja nimi: " +
                nimi + '\'';
    }

}
