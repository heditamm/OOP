import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Loosiratas {
    private List<Külastaja> osalejad = new ArrayList<>();

    void lisaKülastaja(Külastaja külastaja) {
        osalejad.add(külastaja);
    }

    void lisaKülastaja(String külastajaNimi, int külastusteArv) {
        Külastaja ajutine = new Külastaja(külastajaNimi, külastusteArv);
        osalejad.add(ajutine);
    }

    List<Külastaja> kõigeAktiivsemad(int n) {
        List<Külastaja> aktiivsemad = new ArrayList<>();
        Collections.sort(osalejad);
        for (int i = 0; i < osalejad.size(); i++) {
            if (i <= (n - 1)) {
                aktiivsemad.add(osalejad.get(i));
            }
        }
        return aktiivsemad;
    }

    Külastaja loosiVõitja() {
        Collections.sort(osalejad);
        int randomInt = (int) Math.floor(Math.random() * (2 - 1 + 1) + 1);
        return osalejad.get(randomInt);
    }
}
