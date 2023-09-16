public class ReducetoZero {
    
    public static void main(String[] args) {
       int res =  numberOfSteps(123);
       System.out.println(res);
    }

    static int count = 0;
    public static int numberOfSteps(int num) {
        if(num==0){
            return count;
        }
        if(num%2==0){
            count++;
            numberOfSteps(num/2);
        }
        if(num%2>0){
            count++;
            numberOfSteps(num-1);
        }
        return count;
    }
}
