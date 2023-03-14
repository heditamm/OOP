public class esimeneprax {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("yoyo");
        }
        double a = 1.5;
        double b = 2.25;
        double c = aritkeskmine(a, b);
        System.out.println("Arvude " + a + " ja " + b + " aritmeetiline keskmine on " + c);
        System.out.println("Arvude 3.4 ja -3.4 aritmeetiline keskmine on " + aritkeskmine(-3.4, 3.4));
        /*
        String firstname = "aa";
        String lastname = "bb";
        boolean isteacher = true;
        int age = 29;
        double weight = 24.4;

        printStuff(firstname,lastname,isteacher,age,weight);*/

    }
    private static void printStuff(String firstname, String lastname, boolean isteacher, int age, double weight){
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(isteacher);
        System.out.println(age);
        System.out.println(weight);
    }
    public static double aritkeskmine(double arv1, double arv2) {
        double summa = arv1 + arv2;
        return summa / 2;
    }

}

