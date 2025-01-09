/* 
3. https://leetcode.com/problems/maximum-subarray/

A detailed explanation of solution
This code identifies the subarray with the maximum sum within an array of numbers. It initializes maxsum to the smallest possible value and currentsum to 0. As it iterates through the array, each number is added to currentsumAfter each addition, the code checks if currentsum The program begins by verifying if the array contains fewer than two elements, returning -1 in such cases. It then initializes largest with the first element of the array and secondlargest as -1. As it iterates through the array, the program updates largest  and secondlargest based on the values encountered. If a value exceeds largest, secondlargest is updated to the current largest, and largest is set to the new value. If a value lies between largest and secondlargest, only secondlargest is updated. After completing the loop, the program returns secondlargest, or -1 if no second-largest value is found.exceeds maxsum and updates maxsum accordingly. If currentsum becomes negative, it resets to 0 since negative sums would not contribute to finding a larger subarray sum. By the end of the iteration,maxsum contains the largest sum of any contiguous subarray, which is returned as the result. This approach is efficient and processes the array in a single pass.
Time Complexity: O(n)
Space Complexity: O(1)


*/

public class question3 {
    public int maxSubArray(int[] nums){

        int maxSum = Integer.MIN_VALUE; // Start with the first element as the initial max sum
        int currentSum = 0; // Current sum to track the ongoing subarray sum

        for(int i = 0;i<nums.length;i++){
            currentSum = currentSum + nums[i];
            maxSum = Math.max(maxSum,currentSum);

            if(currentSum<0){
                currentSum=0;
            }


        }
        return maxSum;
    }
    public static void main(String[] args) {
        question3 solution = new question3();
        int[] nums = {-2, 1, -3, 4, -1, 2}; // Example input
        int result = solution.maxSubArray(nums);
        System.out.println("Max Subarray Sum: " + result); // Output the result
    }
}
