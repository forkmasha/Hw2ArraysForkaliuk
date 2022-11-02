import java.util.Arrays;

public class ReplaceDuplicates {
    public static void main(String[] args) {
        int[] array = {3,3,4,9,5,5,6,6,8,8,10,10,33};
        for (int i : array) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]&& i!=j) {
                    array[j]=0;
                }
            }
        }
        for (int i:array) {
            System.out.print(i+" ");
        }
    }
}