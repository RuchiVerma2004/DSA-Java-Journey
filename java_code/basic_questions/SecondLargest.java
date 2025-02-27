public class SecondLargest {

    static int secondL(int[] array){
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for(int i : array){
            if(i>max){
                smax = max;
                max= i;
            }else if(i > smax && i!=max){
                smax = i;
            }
        }

        return smax;
    }
    public static void main(String[] args) {
        int[] array = {12,54,56,87,32,98,45,78};
        int result = secondL(array);
        System.out.println(result);
    }
}
