public class SumOfPositiveNumbers {
    public static void main(String[] args) {
        int array[]={-2,-10,2,3,4,6,3,1,3,3,6,7,-99};
        double suma=0;
        for (int i:array) {
            if(i>0){
                suma=suma+i;
            }
        }
        System.out.println("Suma of all positive numbers"+suma);
    }
}
