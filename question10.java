/* 10. https://leetcode.com/problems/merge-sorted-array/description/
A detailed explanation of solution
This code merges two sorted arrays, num1 and num2, directly into num1. It starts by comparing the largest remaining elements from both arrays and places the larger one at the last available position in num1. The process uses three pointers: i for the current position in num1,j for the current position in num2, and k for the last position in the merged array. The merging continues until all elements from num2 are inserted into num2. The algorithm runs with a time complexity of O(m+n)O(m + n)O(m+n), where mmm and nnn are the sizes of the two arrays. The space complexity is O(1)O(1)O(1) as the operation is performed in-place without requiring additional memory.
The time complexity : O(m+n)

The space complexity : O(1)

*/

import java.util.Arrays;

class question10 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;

            }
            else{
                nums1[k]=nums2[j];
                k--;
                j--;
            }
        }
    }

    public static void main(String[] args){
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        int m=3;
        int n=3;
        merge(nums1 , m , nums2 , n);
        for(int i=0;i<m+n;i++){
            System.out.println(nums1[i] + " ");
        }
    }    
}



