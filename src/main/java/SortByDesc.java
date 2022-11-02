import java.util.Arrays;

public class SortByDesc {
    public static void main(String[] args) {
        double[] array = {2, 3, 1, 7, 11};
        Arrays.sort(array);
        for(int i=array.length-1;i>=0;i--){
            System.out.println(array[i]+" ");
        }
    }

}
