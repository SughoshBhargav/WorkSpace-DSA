public class SameDigit{
    public static void main(String[] args) {
        String str = "2300019";
        System.out.println(findDigit(str));
    }

    private static String findDigit(String str) {
        String maxGoodInteger = "";

        for (int i = 0; i <= str.length() - 3; i++) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(i + 1);
            char c3 = str.charAt(i + 2);

            if (c1 == c2 && c1 == c3) {
                // Found a potential good integer
                String potentialGoodInteger = str.substring(i, i + 3);

                // Check if it's greater than the current max good integer
                if (potentialGoodInteger.compareTo(maxGoodInteger) > 0) {
                    maxGoodInteger = potentialGoodInteger;
                }

                // Skip over leading zeros
                while (i < str.length() - 3 && str.charAt(i) == '0') {
                    i++;
                }
            }
        }

        return maxGoodInteger;
    }
}
