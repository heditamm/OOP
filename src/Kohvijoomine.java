public class Kohvijoomine {
    static Kohv latte = new Kohv("latte", 1.5);
    static Kohv cappuccino = new Kohv("cappuccino", 2);
    static Programmeerija paul = new Programmeerija("Paul", 890, 4, latte);
    static Programmeerija jaan = new Programmeerija("Jaan", 500, 2, cappuccino);
    static Programmeerija tarmo = new Programmeerija("Tarmo", 900, 0, null);

    public static void main(String[] args) {
        System.out.println(paul.toString());
        System.out.println(jaan.toString());
        System.out.println(tarmo.toString());

        paul.setTasseKohvi(paul.getTasseKohvi()+3);
        paul.setRiduKoodi(paul.getRiduKoodi()*2);
        jaan.setRiduKoodi(jaan.getRiduKoodi()*2);
        jaan.setTasseKohvi(jaan.getTasseKohvi()+3);
        tarmo.setRiduKoodi(tarmo.getRiduKoodi()+100);

        System.out.println(paul.toString());
        System.out.println(jaan.toString());
        System.out.println(tarmo.toString());
    }

}
