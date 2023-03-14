import java.util.ArrayList;
import java.util.List;

public class Atraktsioon {
    private String atraktsiooniNimi;
    private int minimaalneVanus;

    public Atraktsioon(String atraktsiooniNimi, int minimaalneVanus) {
        this.atraktsiooniNimi = atraktsiooniNimi;
        this.minimaalneVanus = minimaalneVanus;
    }

    public boolean vanusedSobivad(Dokument[] dokumendid) {
        return ebasobivadDokumendid(dokumendid).isEmpty();
    }

    public List<Dokument> ebasobivadDokumendid(Dokument[] dokumendid) {
        List<Dokument> ebasobivadDokumendid = new ArrayList<>();
        for (Dokument dokument : dokumendid) {
            if (!dokument.vanusOnVähemalt(18)) {
                ebasobivadDokumendid.add(dokument);
            }
        }
        return ebasobivadDokumendid;
    }

    @Override
    public String toString() {
        return "Atraktsioon{" +
                "atraktsiooniNimi='" + atraktsiooniNimi + '\'' +
                ", minimaalneVanus=" + minimaalneVanus +
                '}';
    }
}
