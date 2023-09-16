public class NextLargestPrime {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(nextElem(n));
    }

    private static int nextElem(int n) {
        
        int nextEle = n + 1;
        while(true){
            if(isprime(nextEle)){
                return nextEle;
            }
            else{
                nextEle++;
            }
        }
    }

    private static boolean isprime(int n) {
    
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
