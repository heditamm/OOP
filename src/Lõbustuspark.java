import java.util.ArrayList;
import java.util.List;

public class Lõbustuspark {
    private List<Lõbustus> lõbustused;

    public Lõbustuspark(List<Lõbustus> lõbustused) {
        this.lõbustused = lõbustused;
    }

    void alustaSeiklust(KülastajaPraks külastaja) {
        System.out.println("alustan seiklust");
        for (Lõbustus lõbustus : lõbustused) {
            lõbustus.lõbusta(külastaja);
        }
        System.out.println("Külastuste kirjeldused" +külastaja.kõikKirjeldused());
        System.out.println("Kulud "+külastaja.kuludeSumma());
    }
}
