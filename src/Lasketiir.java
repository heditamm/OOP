public class Lasketiir implements Lõbustus {
    public void lõbusta(KülastajaPraks külastaja) {
        int randomInt = (int) Math.floor(Math.random() * (21) + 0);
        külastaja.lisaKirjeldused(String.format("Tabasin lasketiirus %s sihtmärki", randomInt));
    }
}
