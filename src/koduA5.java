public class koduA5 {
    public static void main(String[] args) {
        int[] väiksemad = massiiv(10, 50, 120);
        int[] keskmised = massiiv(15, 120, 160);
        int[] suuremad = massiiv(20, 160, 180);

        System.out.println("Väiksemad: ");
        for (int i = 0; i < väiksemad.length; i++) {
            if (väiksemad[i]>80)
                System.out.print(väiksemad[i]+" ");
            else
                continue;
        }
        String newline= System.lineSeparator();
        System.out.println(newline);
        System.out.println("Keskmised: ");
        for (int i = 0; i < keskmised.length; i++) {
            if (keskmised[i]>80)
                System.out.print(keskmised[i]+" ");
            else
                continue;
        }
        System.out.println(newline);
        System.out.println("Suured:");
        for (int i = 0; i < suuremad.length; i++) {
            if (suuremad[i]>80)
                System.out.print(suuremad[i]+" ");
            else
                continue;
        }
    }
    public static int vahemik(int min, int max){
        int arv = (int)((Math.random()*(max-min))+min);
        return Math.round(arv);
    }
    public static int[] massiiv(int arv, int alumine, int ülemine){
        int[] hulk = new int[arv];
        for (int i = 0; i < arv; i++) {
            hulk[i]=vahemik(alumine, ülemine);
            
        }
        return hulk;
    }
    public static int keskmine(int[] mass){
        return 0; //ei osanud arvutada
    }

}
