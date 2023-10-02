import java.util.ArrayList;

public class LargestGroup {
    public static void main(String[] args) {
        String s = "aaa";
        largeGroupPositions(s);
    }




    public static void largeGroupPositions(String s) {
        

        ArrayList<ArrayList<Integer> > list = new ArrayList<ArrayList<Integer>>();
        int start = 0;
        int end = 0;
        while(end <= s.length()-1){
            if(s.charAt(start)==s.charAt(end)){
                end++;
            }
            else{
                if((s.substring(start, end).length())>=3){
                    ArrayList<Integer> a1 = new ArrayList<Integer>();
                    a1.add(start);
                    a1.add(end-1); 
                    list.add(a1);
                }
                start = end;
            }
        }

        if((s.substring(start, end).length())>=3){
                    ArrayList<Integer> a1 = new ArrayList<Integer>();
                    a1.add(start);
                    a1.add(end-1); 
                    list.add(a1);
                }
        System.out.println(list.toString());

    }
}
