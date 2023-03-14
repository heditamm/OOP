import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class praks2 {
    private static final int[] esimene = {-10, 17, 21};
    private static final int[] teine = {-2, 5, 17, 28};
    private static final int[] kolmas = {1, 3, -2, -1, 0};

    public static void main(String[] args) {
        System.out.println("Combined array is: " + Arrays.toString(combineSourceArrays()));
        System.out.println("Reversed array is: " + Arrays.toString(reverseArray()));
    }

    private static int[] reverseArray() {
        return IntStream.rangeClosed(1, kolmas.length).map(i-> -kolmas[kolmas.length-i]).toArray();
    }

    private static int[] combineSourceArrays() {
        int length = esimene.length + teine.length;
        int[] joined = new int[length];
        System.arraycopy(esimene, 0, joined, 0, esimene.length);
        System.arraycopy(teine, 0, joined, esimene.length, teine.length);
        Arrays.sort(joined);
        return joined;
    }

}
