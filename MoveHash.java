public class MoveHash {
    public static void main(String[] args) {
        String str = "Move#Hash#to#Front";
        String hash = "";
        String finalStr = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='#'){
                hash += str.charAt(i);
            }
            else{
                finalStr += str.charAt(i);
            }
        }
        System.out.println(hash+finalStr);
    }
}
