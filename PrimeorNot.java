public class PrimeorNot {

    public static void main(String[] args) {
        

        int n = 40;
        boolean prime[] = new boolean[n+1];
        isPrime(n,prime);
    }

    private static boolean isPrime(int n,boolean[] prime) {
        

        for(int i=2; i*i<=n; i++){
            if(!prime[i]){
                for(int j=2*i; j<=n; j=j+i){
                    prime[j] = true;
                }
            }
        }

        for(int i=2; i<40; i++){
            if(!prime[i]){
                System.out.print(i+" ");
            }
        }
        return false;


    }


    
}
