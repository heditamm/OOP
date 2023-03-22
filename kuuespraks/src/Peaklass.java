import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.*;


public class Peaklass {
    static List<Lend> loeLennud(String failinimi) throws IOException {
        ArrayList<Lend> lennud = new ArrayList<>();

        File fail = new File(failinimi);
        Scanner sc = new Scanner(fail, StandardCharsets.UTF_8);
        while (sc.hasNextLine()) {
            String rida = sc.nextLine();
            String[] massiiv = rida.trim().split(" ");

            List<String> list = new ArrayList<>(Arrays.asList(massiiv));
            String sihtkoht = list.get(0);
            if (list.size() == 2) {
                double hind = Double.parseDouble(list.get(1));
                Lend ajutineLend = new Lend(sihtkoht, hind);
                lennud.add(ajutineLend);
            }
            if (list.size()==3){
                String sihtkohaRiik = list.get(1);
                double hind = Double.parseDouble(list.get(2));
                RahvusvahelineLend ajutineRahvus = new RahvusvahelineLend(sihtkoht, hind, sihtkohaRiik);
                lennud.add(ajutineRahvus);
            }
        }
        return lennud;
    }

    public static void main(String[] args) throws IOException {
        List<Lend> lennud = loeLennud("lennud.txt");

        TuristiklassiReisija testIsikYks = new TuristiklassiReisija("Jane Pane");
        TuristiklassiReisija testIsikKaks = new TuristiklassiReisija("Jaan Paan");

        EsimeseKlassiReisija testEsimeneYks = new EsimeseKlassiReisija(2);
        EsimeseKlassiReisija testEsimeneKaks = new EsimeseKlassiReisija(1);

        lisaLendudele(lennud, testEsimeneYks);
        lisaLendudele(lennud, testEsimeneKaks);
        lisaLendudele(lennud, testIsikYks);
        lisaLendudele(lennud, testIsikKaks);

        sort(lennud);

        for (Lend lend : lennud) {
            System.out.println(lend);
            lend.väljastaReisijad();
        }

    }

    static void lisaLendudele(List<Lend> lennud, Reisija reisija) {
        shuffle(lennud);
        lennud.get(0).transpordiReisija(reisija);
        lennud.get(1).transpordiReisija(reisija);
        lennud.get(2).transpordiReisija(reisija);
    }
}
