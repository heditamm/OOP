public class Testklass4 {
    public static void main(String[] args) {
        //Tantsupaar
        Tantsupaar esimene = new Tantsupaar("Jaak Paak", 1980, "Sirje Mirje", 1975);
        Tantsupaar teine = new Tantsupaar("Argo Bargo", 1990, "Maarika Vaarika", 1990);

        System.out.println(esimene.VanemPartner(2023));
        System.out.println(teine.VanemPartner(2023));
        System.out.println(esimene.kasSamalAastal());
        System.out.println(teine.kasSamalAastal());
        System.out.println(esimene.perenimed());
        System.out.println(teine.perenimed());
/*
        //ID-kaart
        IDKaart kaart1 = new IDKaart("AB2345678");
        IDKaart kaart2 = new IDKaart("AB2345671");

        System.out.println(kaart1.sugu());
        System.out.println(kaart2.sugu());
        System.out.println(kaart1.sünniaasta());
        System.out.println(kaart2.sünniaasta());
        System.out.println(kaart1.toString());
        System.out.println(kaart2.toString());*/
    }
}
