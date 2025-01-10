import java.util.*;

public class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Initialize the result array with -1 (default value if no greater element is found)
        Arrays.fill(result, -1);

        // Traverse the array twice to simulate circular behavior
        for (int i = 0; i < 2 * n; i++) {
            int currentIndex = i % n; // Get the index in the original array
            
            // Pop elements from the stack if the current number is greater than the stack's top element
            while (!stack.isEmpty() && nums[stack.peek()] < nums[currentIndex]) {
                int index = stack.pop();
                result[index] = nums[currentIndex];
            }
            
            // Push the current index onto the stack (only for the first traversal)
            if (i < n) {
                stack.push(currentIndex);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        NextGreaterElementII solution = new NextGreaterElementII();
        int[] nums = {1, 2, 1};
        int[] result = solution.nextGreaterElements(nums);

        // Print the result
        System.out.println(Arrays.toString(result)); // Output: [2, -1, 2]
    }
}
