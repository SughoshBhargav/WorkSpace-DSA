public class Factorial {
    public static void main(String[] args) {
        int n = 1234;
        findReverse(n);
        System.out.println(sum);
    }

    static int sum = 0;
    private static void findReverse(int n) {


        if(n==0){
            return;
        }
        int rem = n % 10;
        sum = sum*10 + rem;
        findReverse(n/10);


        

    }
}
