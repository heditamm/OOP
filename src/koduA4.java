import static java.lang.Math.round;

public class koduA4 {
    static int meetod(int a, int b){
        return a+b;
    }
    static double meetod(double a){
        double ruut = a*a;
        int ümmartatud = (int) round(ruut);
        return ümmartatud;
    }
    static void meetod(String a, int b){
        for (int i = 0; i < b; i++) {
            System.out.println(a);

        }
    }
    public static void main(String[] args) {
        System.out.println(meetod(3.5));
        System.out.println(meetod(3, 5));
        meetod("tere", 5);
    }
}
