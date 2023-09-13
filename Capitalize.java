public class Capitalize {
    public static void main(String[] args) {
        String str = "hello world";
        String target = "l";
        StringBuilder finalStr = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==target.charAt(0)){
                finalStr.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                finalStr.append(str.charAt(i));
            }
        }
        System.out.println(finalStr);
    }
}
