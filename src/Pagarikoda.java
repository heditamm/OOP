import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.*;

public class Pagarikoda {
    static List<Kook> loeKoogid(String failinimi) throws FileNotFoundException {
        ArrayList<Kook> koogid = new ArrayList<>();

        File file = new File(failinimi);
        Scanner sc = new Scanner(file, "UTF-8");
        while (sc.hasNextLine()) {
            String rida = sc.nextLine();
            String[] massiiv = rida.trim().split(";");

            List<String> list = new ArrayList<>(Arrays.asList(massiiv));
            String tordiNimi = list.get(0);
            String parimenne = list.get(1).replaceAll(" ", "");
            LocalDate localDate = LocalDate.parse(parimenne);
            double ruutHind = Double.parseDouble(list.get(2));
            list.remove(0);
            list.remove(0);
            list.remove(0);

            if (list.size() == 1) {
                ÜmmarguneKook ajutine = new ÜmmarguneKook(tordiNimi, localDate, ruutHind, Double.parseDouble(list.get(0)));
                koogid.add(ajutine);
            }
            if (list.size() == 2) {
                RistkülikukujulineKook ajutine = new RistkülikukujulineKook(tordiNimi, localDate, ruutHind, Double.parseDouble(list.get(0)), Double.parseDouble(list.get(1)));
                koogid.add(ajutine);
            }
            if (list.size() == 3) {
                KolmnurkneKook ajutine = new KolmnurkneKook(tordiNimi, localDate, ruutHind, Double.parseDouble(list.get(0)), Double.parseDouble(list.get(1)), Double.parseDouble(list.get(2)));
                koogid.add(ajutine);
            }

        }
        return koogid;
    }

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Kook> kookideList = (ArrayList<Kook>) loeKoogid("koogid.txt");
        Collections.sort(kookideList);

        for (Kook kook : kookideList) {
            System.out.println(kook);
        }
    }


}
