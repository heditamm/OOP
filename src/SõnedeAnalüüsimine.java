public class SõnedeAnalüüsimine {
    public static void main(String[] args) {
        SõnedeAnalüsaator sõne = new SõnedeAnalüsaator("Tere see on testike");
        sõne.väljastaSõne();
        System.out.println("Sõne sees olevate sõnade keskmine pikkus on " + sõne.leiaKeskminePikkus());
        System.out.println("Sõnes olev pikim sõna on " + sõne.leiaPikimSõna());
    }
}
