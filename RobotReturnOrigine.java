public class RobotReturnOrigine {
    public static void main(String[] args) {
        String str = "RRDD";
        System.out.println(findResult(str));
    }

    private static boolean findResult(String moves) {
        

        int frequency[] = new int[4];

        for(int i=0; i<moves.length(); i++){
            if(moves.charAt(i)=='L'){
                frequency[0]++;
            }
            else if(moves.charAt(i)=='R'){
                frequency[1]++;
            }
            else if(moves.charAt(i)=='U'){
                frequency[2]++;
            }
            else{
                frequency[3]++;
            }
        }

        int ans = 0;

        
        ans = frequency[0]^frequency[1]^frequency[2]^frequency[3];
        System.out.println(frequency[0]^frequency[1]);
        System.out.println(frequency[0]^frequency[1]^frequency[2]);
        System.out.println(frequency[0]^frequency[1]^frequency[2]^frequency[3]);


        if(ans==0){
            return true;
        }
        return false;
    
    }
}
