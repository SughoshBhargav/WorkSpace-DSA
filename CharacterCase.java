import java.util.Scanner;

public class CharacterCase {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(Character.isLowerCase(ch))   
            return 0;
        else if(Character.isUpperCase(ch))
            return 1;
        else{
            return -1;
        }
        

    }
}
