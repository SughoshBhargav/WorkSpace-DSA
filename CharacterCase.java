import java.util.Scanner;

public class CharacterCase {
    public static void main(String[] args) {
        
        int ans  = 0;
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(Character.isLowerCase(ch))   
            ans = 0;
        else if(Character.isUpperCase(ch))
            ans=  1;
        else{
            ans = -1;
        }
        System.out.println(ans);
        sc.close();

    }
}
