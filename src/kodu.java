public class kodu {
    public static void main(String[] args) {

        int[] jarj1 = {1, 3, 6};
        int[] jarj2;
        jarj2 = jarj1;
        System.out.println(jarj1[1]);
        System.out.println(jarj2[1]);
        jarj2[1] = 4;
        System.out.println(jarj2[1]);
        System.out.println(jarj1[1]);

    }
}
