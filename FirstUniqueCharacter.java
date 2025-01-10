import java.util.*;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        // Map to store the frequency of each character
        Map<Character, Integer> charCount = new HashMap<>();
        
        // Count the frequency of each character
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Find the first unique character by checking frequencies
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        // No unique character found
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacter solution = new FirstUniqueCharacter();
        String s = "loveleetcode";
        int result = solution.firstUniqChar(s);

        // Print the result
        System.out.println(result); // Output: 2
    }
}
