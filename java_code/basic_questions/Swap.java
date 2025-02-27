
public class Swap {

    static void swap(int a, int b){
        // As java is a pass by value language original values of a which is in main method will not changes 
        // changes you make in swap method will remain only in swap method

        int temp = a;
        a = b;
        b= temp;

        System.out.println("Value of a after Swap:"+a);
        System.out.println("Value of b after Swap:"+b);
        return ;

    }
    public static void main(String[] args) {
        int a = 10;
        int b= 20;
        System.out.println("Value of a before Swap:"+a);
        System.out.println("Value of b before Swap:"+b);

        swap(a,b);

    }
}
