
public class Fibb {

    static int fibb(int num){
        if(num<=1){
            return num;
        }
        int a = 0;
        int b = 1;
        int temp;
        System.out.print(a+" "+b+" ");
        for(int i = 2; i<=num; i++){
            temp = b;
            b = a+b;
            a = b;
            System.out.print(b+" ");
        }

        return a;
    }

    public static void main(String[] args) {

        int result = fibb(8);
        System.out.println();
        System.out.println("8th fibbonachi number: "+ result);
    }
}
