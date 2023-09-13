public class Patterns {
    
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            if(i>6){
                for(int j=9-i+1; j>=0; j--){
                   System.out.print("*");
                }
            }else{
                for(int j=1; j<=i; j++){
                   System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
