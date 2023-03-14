public class SõnedeAnalüsaator {
    private String analüüsitavSõne;

    public SõnedeAnalüsaator(String analüüsitavSõne) {
        this.analüüsitavSõne = analüüsitavSõne;
    }

    void väljastaSõne() {
        System.out.println("Analüüsitav sõne on " + analüüsitavSõne);
    }

    double leiaKeskminePikkus() {
        String arrayna[] = analüüsitavSõne.split(" ");
        double summa = 0;
        int count = 0;
        double keskmine = 0;
        for (String sõna : arrayna) {
            int pikkus = sõna.length();
            summa = summa + pikkus;
            count++;
        }
        keskmine = summa / count;
        return keskmine;
    }

    String leiaPikimSõna() {
        String arrayna[] = analüüsitavSõne.split(" ");
        String pikim = "";
        for (String sõna : arrayna) {
            if (pikim.length() < sõna.length()) {
                pikim = sõna;
            } else {
                continue;
            }
        }
        return pikim;
    }
}
