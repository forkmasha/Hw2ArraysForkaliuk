import java.util.Arrays;

public class ReplaceDuplicates {
    public static void main(String[] args) {
        int[] array = {3, 11, 33, 12, 4, 4, 8, 3};
        for (int i : array) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j]=0;
                    array[i]=0;
                }
            }
        }
        for (int i:array) {
            System.out.print(i+" ");
        }
    }
}