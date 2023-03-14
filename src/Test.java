
public class Test {
    public static void main(String[] args) {
        Atraktsioon mäed = new Atraktsioon("Ameerika mäed", 14);
        Atraktsioon hull = new Atraktsioon("Hullumaja", 12);
        Dokument[] dokumendid = {
                new IdKaart("60801011234"),
                new Õpilaspilet(2010)
        };
        for(Dokument dokument: mäed.ebasobivadDokumendid(dokumendid)){
            System.out.println(dokument);
        }
        System.out.println("sobib: " + mäed.vanusedSobivad(dokumendid));
        for(Dokument dokument: hull.ebasobivadDokumendid(dokumendid)){
            System.out.println(dokument);
        }
        System.out.println("sobib: " + hull.vanusedSobivad(dokumendid));
    }



}
