import java.util.HashMap;

public class TestQ2 {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> freqMap = new HashMap<>();

        // Update frequency count of each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freqMap.get(c) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        int index = firstUniqChar(s);
        System.out.println(index);
    }
}



