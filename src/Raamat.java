public class Raamat {
    private Isik autor;
    private String pealkiri;

    public Raamat(Isik autor, String pealkiri) {
        this.autor = autor;
        this.pealkiri = pealkiri;
    }

    public Raamat(String oskarLuts, String kevade) {
    }

    public static void main(String[] args) {
        Raamat kevade = new Raamat("Oskar Luts", "Kevade");
        Raamat[] riiul = new Raamat[100];
        System.out.println(riiul[8]);
        riiul[8]=kevade;
        System.out.println(riiul[8]);

        String autor = "Eduard Vilde";
        for (int i = 0; i < riiul.length; i++) {
            riiul[i] = new Raamat(autor, "Kogutud teosed" + String.valueOf(i+1));
        }
        System.out.println("10. raamat riiulil on " + riiul[9] + ".");
    }

    @Override
    public String toString() {
        return "Raamat{" +
                "autor='" + autor + '\'' +
                ", pealkiri='" + pealkiri + '\'' +
                '}';
    }
}
