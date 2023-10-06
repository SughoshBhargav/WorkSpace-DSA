public class SumofNum {
    public static void main(String[] args) {
        int c = 1;
        System.out.println(isTrue(c));
    }

    private static boolean isTrue(int c) {
        
        for(int i=0; i<c; i++){
            for(int j=0; j<c; j++){
                if((i*i)+(j*j)==c){
                    return true;
                }
            }
        }
        
        return false;
    }
}
