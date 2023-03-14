import java.util.Arrays;

public class praks2_2 {
    private static final int[] boy_heights = {180, 175, 200, 172, 169, 183, 188};
    private static final int[] girl_heights = {165, 167, 172, 169, 162};

    public static void main(String[] args) {
        printOGHeight();
        sortHeight();
        printPairsnLeftovers();
    }

    private static void printOGHeight() {
        System.out.println("Boys heights: " + Arrays.toString(boy_heights));
        System.out.println("Girls heights: " + Arrays.toString(girl_heights));
    }

    private static void sortHeight() {
        Arrays.sort(boy_heights);
        Arrays.sort(girl_heights);
    }

    private static void printPairsnLeftovers() {
        int[] boyheights = boy_heights;
        int[] girlheights = girl_heights;
        int[] boyheightsleft = {};
        int[] girlheightsleft = {};

        if (boy_heights.length>girl_heights.length){
            boyheights = Arrays.copyOfRange(boy_heights, 0, girl_heights.length);
            boyheightsleft = Arrays.copyOfRange(boy_heights, girl_heights.length, boy_heights.length);
        }
        else{
            girlheights = Arrays.copyOfRange(girl_heights, 0, boy_heights.length);
            girlheightsleft = Arrays.copyOfRange(girl_heights, boy_heights.length, girl_heights.length);
        }

        printPairs(boyheights, girlheights);
        printWithoutpartners(boyheightsleft, "boys");
        printWithoutpartners(girlheightsleft, "girls");
    }

    private static void printPairs(int[] boyheights, int[] girlheights) {
        StringBuilder pairs = new StringBuilder();
        for (int i = 0; i <boyheights.length; i++) {
            pairs.append("(").append(boyheights[i]).append(", ").append(girlheights[i]).append(") ");
        }
        System.out.println("Dance pairs are: " + pairs.toString().trim());
    }

    private static void printWithoutpartners(int[] leftovers, String gender) {
        if (leftovers.length>0){
            System.out.println("THe following" + gender + " were left without a partner: " + Arrays.toString(leftovers));
        }
    }
}
