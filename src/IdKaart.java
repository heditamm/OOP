import java.time.LocalDate;

public class IdKaart implements Dokument{
    private String isikukood;

    public IdKaart(String isikukood){
        this.isikukood = isikukood;
    }


    public String getIsikukood() {
        return isikukood;
    }

    public void setIsikukood(String isikukood) {
        this.isikukood = isikukood;
    }

    String sugu() {
        String sugu = "";
        String esimeneNumber = String.valueOf(getIsikukood().charAt(0));
        if (esimeneNumber.equals("1") || esimeneNumber.equals("3") || esimeneNumber.equals("5")) {
            return "mees";
        }
        if (esimeneNumber.equals("2") || esimeneNumber.equals("4") || esimeneNumber.equals("6")) {
            return "naine";
        }
        return sugu;
    }

    int sünniaasta() {
        int algus = Integer.parseInt(isikukood.substring(0, 1));
        int aasta = Integer.parseInt(isikukood.substring(1, 3));
        if (algus <= 2)
            return 1800 + aasta;
        if (algus <= 4)
            return 1900 + aasta;
        if (algus <= 6)
            return 2000 + aasta;
        return 2100 + aasta;

    }
    public boolean vanusOnVähemalt(int x) {
        int praeguneAasta = LocalDate.now().getYear();
        return sünniaasta() <= praeguneAasta - x;
    }

    @Override
    public String toString() {
        return "IDKaart{" +
                ", isikukood='" + isikukood + '\'' +
                ", inimese sugu='" + sugu() + '\'' + ", inimese sünnikuupäev='" +
                sünniaasta() + "'}";
    }
}
