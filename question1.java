/*1. https://leetcode.com/problems/two-sum/

A detailed explanation of solution

The approach involves examining all possible pairs of numbers in the array to determine if their sum equals the target value. The outer loop selects one number, while the inner loop iterates through the subsequent numbers to find a matching pair. If a pair is found whose sum equals the target, the indices of those numbers are returned. This straightforward method ensures that every possible pair is evaluated until the correct one is identified.
Time Complexity: O(n^2)
Space Complexity: O(1)
*/


class question1 {
    public int[] twoSum(int[] nums, int target) {
        // Loop through each pair of numbers in the array
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the pair adds up to the target
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j}; // Return the indices
                }
            }
        }
        // Return an empty array if no solution is found (this won't happen as per the problem)
        return new int[] {};
    }

    // Example usage:
    public static void main(String[] args) {
        question1 solution = new question1();
        int[] nums = {2, 7, 11, 15};
        int target = 13;

        // Call the twoSum method and print the result
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}

