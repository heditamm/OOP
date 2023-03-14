import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Võistlused {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("võistlused.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            StringBuilder rida = new StringBuilder();
            rida.append(scanner.nextLine());
            String asString = rida.toString();
            System.out.println(lühenda(asString));
        }
    }

    static String lühenda(String rida) {
        String[] osad = rida.split(" ");
        StringBuilder lühendiSb = new StringBuilder();
        for (int i = 0; i < osad.length; i++) {
            try {
                Integer.parseInt(osad[i]);
                lühendiSb.append("'");
                String last2 = osad[i].substring(osad[i].length() - 2);
                lühendiSb.append(last2);
            } catch (NumberFormatException ex) {
                String täht = String.valueOf(osad[i].charAt(0));
                lühendiSb.append(täht.toUpperCase());
            }
        }
        String stringina = lühendiSb.toString();
        return stringina;
    }
}