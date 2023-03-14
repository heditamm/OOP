import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TranspordiametiKampaania {
    public static void main(String[] args) {
        ArrayList<Kodanik> eemaldatud = new ArrayList<>();
        ArrayList<Kodanik> kodanikud = loeKodanikud("C:\\Users\\hedit\\IdeaProjects\\OOP\\src\\kodanikud.txt");
        for (Kodanik kodanik : kodanikud){
            boolean jahEi = kodanik.kasJuhilubaOnOlemas();
            if(jahEi){
                System.out.println(kodanik.toString() + " juhiluba kingituseks ei saanud, põhjus: juhiluba juba olemas.");
            }
            else{
                boolean kas18 = kodanik.kasOnTäiskasvanuAastal2018();
                if (kas18){
                    System.out.println(kodanik.toString() + " sai juhiloa kingituseks.");
                    eemaldatud.add(kodanik);
                }
                else {
                    System.out.println(kodanik.toString() + " juhiluba kingituseks ei saanud, põhjus: pole täiskasvanu.");
                }
            }
            }
        kodanikud.removeAll(eemaldatud);
        System.out.println("Kodanikud, kes jäid kingitusest ilma: ");
        for (Kodanik kodanik1 : kodanikud){
            System.out.println(kodanik1.getIsikukood());
        }
    }
    static ArrayList<Kodanik> loeKodanikud(String failiNimi){
        ArrayList<Kodanik> kodanikud = new ArrayList();
        File file = new File(failiNimi);
        boolean olemasolu;
        try(Scanner sc = new Scanner(file, "UTF-8")){
            while (sc.hasNextLine()){
                String rida = sc.nextLine();
                String[] massiiv = rida.split(",");
                String jahEi = massiiv[massiiv.length-1];

                if (jahEi.equals("Olemas")){
                    olemasolu = true;
                }
                else {
                    olemasolu = false;
                }
                 kodanikud.add(new Kodanik(massiiv[1], massiiv[0], massiiv[2], olemasolu));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return kodanikud;
    }
}
