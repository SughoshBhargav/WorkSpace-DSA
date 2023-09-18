import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class EvenDigits {
    public static void main(String[] args) {
        int digits[] = {2,2,8,8,2};
        findEven(digits);
    }

    private static void findEven(int[] digits) {
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                if (j != i) {
                    for (int k = 0; k < digits.length; k++) {
                        if (k != i && k != j) {
                            int number = digits[i] * 100 + digits[j] * 10 + digits[k];
                            if(number>=100&&number%2==0){
                                list.add(number);
                            }
                        }
                    }
                }
            }
        }
        
        Collections.sort(list);
        ArrayList<Integer> newList = new ArrayList();
        for(int i=0; i<list.size(); i++){
            if(!newList.contains(list.get(i))){
                newList.add(list.get(i));
            }
        }
        int ans[] = new int[newList.size()];
        for(int i=0; i<newList.size(); i++){
            ans[i] = newList.get(i);
        }
        System.out.println(Arrays.toString(ans));
    }
}
