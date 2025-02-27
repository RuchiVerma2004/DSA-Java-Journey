class Prime{

    static boolean isPrime(int num){
        if(num<2){
            return false;
        }

        int i=2;
        while(i<=Math.sqrt(num)){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 56;
        boolean result = isPrime(num);
        System.out.println(result);
    }
}