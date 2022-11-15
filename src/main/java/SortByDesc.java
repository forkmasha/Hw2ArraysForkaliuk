import java.util.Arrays;
import java.util.Collections;

public class SortByDesc {
    public static void main(String[] args) {
        double[] array = {2.5, 3, 1, 7.3, 11};
        Arrays.sort(new double[][]{array}, Collections.reverseOrder());
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i] + " ");
        }
    }

}
