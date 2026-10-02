public class IsPrime {
    public static void main(String[] args) {

        boolean result1=isPrime(23);
         boolean result2=isPrime(25);

         System.out.println(result1);
         System.out.println(result2);

        
    }

    static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }

        return true;
    }
}
