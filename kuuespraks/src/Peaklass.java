import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.stream.Collectors.toList;

public class Peaklass {
    public static void main(String[] args) throws Exception {
        System.out.println(loeTeosed("C:\\Users\\hedit\\IdeaProjects\\OOP\\kuuespraks\\src\\laenutused.txt"));

    }

    public static List<Teos> loeTeosed(String failinimi) throws Exception {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(failinimi), StandardCharsets.UTF_8))) {
            return bufferedReader.lines().map(rida -> rida.split("; ")).map(reaOsad -> reaOsad[0].contains("/") ?
                    new Ajakiri(reaOsad[0], reaOsad[1], reaOsad[2], Integer.parseInt(reaOsad[3])) :
                    new Raamat(reaOsad[0], reaOsad[1], reaOsad[2], Integer.parseInt(reaOsad[3]))).collect(toList());
        }
    }
}
