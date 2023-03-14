public class Tantsupaar {
    private String poisiNimi;
    private int poisiSünniaasta;
    private String tüdrukuNimi;
    private int tüdrukuSünniaasta;

    public Tantsupaar(String poisiNimi, int poisiSünniaasta, String tüdrukuNimi, int tüdrukuSünniaasta) {
        this.poisiNimi = poisiNimi;
        this.poisiSünniaasta = poisiSünniaasta;
        this.tüdrukuNimi = tüdrukuNimi;
        this.tüdrukuSünniaasta = tüdrukuSünniaasta;
    }

    public String getPoisiNimi() {
        return poisiNimi;
    }

    public void setPoisiNimi(String poisiNimi) {
        this.poisiNimi = poisiNimi;
    }

    public int getPoisiSünniaasta() {
        return poisiSünniaasta;
    }

    public void setPoisiSünniaasta(int poisiSünniaasta) {
        this.poisiSünniaasta = poisiSünniaasta;
    }

    public String getTüdrukuNimi() {
        return tüdrukuNimi;
    }

    public void setTüdrukuNimi(String tüdrukuNimi) {
        this.tüdrukuNimi = tüdrukuNimi;
    }

    public int getTüdrukuSünniaasta() {
        return tüdrukuSünniaasta;
    }

    public void setTüdrukuSünniaasta(int tüdrukuSünniaasta) {
        this.tüdrukuSünniaasta = tüdrukuSünniaasta;
    }

    int VanemPartner(int jooksevAasta) {
        int tüdrukuVanus = jooksevAasta - getTüdrukuSünniaasta();
        int poisiVanus = jooksevAasta - getPoisiSünniaasta();

        if (tüdrukuVanus > poisiVanus) {
            return tüdrukuVanus;
        } else {
            return poisiVanus;
        }
    }

    boolean kasSamalAastal() {
        if (poisiSünniaasta == tüdrukuSünniaasta) {
            return true;
        } else {
            return false;
        }
    }

    String perenimed() {
        String[] tüdruk = tüdrukuNimi.split(" ");
        String[] poiss = poisiNimi.split(" ");

        return poiss[1] + " " + tüdruk[1];
    }

    @Override
    public String toString() {
        return "Tantsupaari perenimed on = " + perenimed();
    }
}
