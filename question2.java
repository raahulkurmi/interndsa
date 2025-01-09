/* 
2.  https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
A detailed explanation of solution
Detailed Solution Explanation
The solution generates an array of size nnn where the sum of all elements is zero. If nnn is odd, a 0 is placed at the last position of the array. The remaining elements are filled using a loop, adding pairs of positive and negative integers. For instance, -1 is placed at index 0, 1 at index 1, -2 at index 2, 2 at index 3, and so on, until the array is fully populated. This approach guarantees that the total sum of the array equals zero. The code works seamlessly for both odd and even values of nnn and prints the resulting array after completing the process.
Time Complexity: O(n)
Space Complexity: O(n)


*/

import java.util.Arrays;

class question2{
    public int[] sumzero(int n){
        int[] arr = new int[n];
        if(n%2!=0){
            arr[n-1] = 0; // If n is odd, place 0 at the end      
        }
        // Use loop to fill the arr
        if(n>1){
            for (int i = 0; i < n - 1; i=i+2) {
                arr[i + 1] = i + 1;      // Positive number at even index
                arr[i] = -(i + 1); // Negative number at the next odd index
            }
        }

        return arr; 
    }
    public static void main(String[] args) {
        question2 solution = new question2();
        int n = 15; // Example input
        int[] result = solution.sumzero(n);

        // Print the result array
        System.out.println(Arrays.toString(result));

    }
}
