public class Average {
    public static void main(String[] args) {
        int[]array={-2,3,4,20,11,23,44,39};
        int suma=0;
        int count =0;
        for (int i:array) {
            suma=suma+i;
            count++;
        }
        System.out.println("Average of array = "+(suma/count));
    }
}
