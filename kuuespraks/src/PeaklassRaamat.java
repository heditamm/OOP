import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static java.util.Collections.sort;
import static java.util.stream.Collectors.toList;

public class PeaklassRaamat {
    private static final String INPUT_FILE = "laenutused.txt";

    public static <SuurimaViiviseLeidja> void main(String[] args) throws Exception {
        List<Teos> teosed = loeTeosed(INPUT_FILE);
        sort(teosed);
        teosed.forEach(System.out::println);

        ViiviseHoiataja viiviseHoiataja = new ViiviseHoiataja(0.2);
        teosed.forEach(teos -> teos.arvutaViivis(viiviseHoiataja));
        System.out.println(viiviseHoiataja.getHoiatatavadLaenutajad());

        SuurimViiviseLeidja suurimaViiviseLeidja = new SuurimViiviseLeidja();
        teosed.forEach(teos -> teos.arvutaViivis(suurimaViiviseLeidja));
        suurimaViiviseLeidja.SaadaHoiatus();
    }

    public static List<Teos> loeTeosed(String failinimi) throws Exception {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(failinimi), StandardCharsets.UTF_8))) {
            return bufferedReader.lines().map(rida -> rida.split("; ")).map(reaOsad -> reaOsad[0].contains("/") ?
                    new Ajakiri(reaOsad[0], reaOsad[1], reaOsad[2], Integer.parseInt(reaOsad[3])) :
                    new Raamat(reaOsad[0], reaOsad[1], reaOsad[2], Integer.parseInt(reaOsad[3]))).collect(toList());
        }
    }
}
