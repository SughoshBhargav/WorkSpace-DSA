import java.util.Arrays;

public class ShortestDistance {
    public static void main(String[] args) {
        String str = "loveleetcode";
        char c = 'c';
        findResult(str, c);
    }

    private static void findResult(String str, char c) {
        int[] arr = new int[str.length()];
        int start = -1; // Initialize start to -1, so it starts at the first occurrence of c.
        int index = 0;

        for (int end = 0; end < str.length(); end++) {
            if (str.charAt(end) == c) {
                if (start != -1) {
                    arr[index++] = end - start;
                }
                start = end;
            }
        }

        // Resize the array to contain only the valid distances
        arr = Arrays.copyOf(arr, index);

        System.out.println(Arrays.toString(arr));
    }
}
