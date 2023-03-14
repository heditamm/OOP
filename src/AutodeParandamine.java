public class AutodeParandamine {
    public static void main(String[] args) {
        Auto auto = new Auto("Peeter Neeter", "Audi A6", false);
        Veoauto veok = new Veoauto("Maarika Vaarika", "Volvo", false, true);
        Luksusauto lux = new Luksusauto("Ahto Pahto", "Chevorlette", true, 2016);
        Limusiin limo = new Limusiin("Marco Tasane", "Rolls Royce", true, 2019);

        int aeg = (int) (Math.random() * ((21) + 1)) / 2;
        Autoteenindus teenindus = new Autoteenindus();
        teenindus.paranda(auto, aeg);
        teenindus.paranda(veok, aeg);
        teenindus.paranda(lux, aeg);
        teenindus.paranda(limo, aeg);
        System.out.println(teenindus);
    }

}
