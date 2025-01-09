/* 
9. https://leetcode.com/problems/search-insert-position/description/
A detailed explanation of solution
This algorithm employs binary search to identify the appropriate position for inserting a target value into a sorted array. It initializes two pointers,start  and end, to define the search boundaries. In each iteration, it calculates the midpoint and compares the middle element with the target. If they are equal, it returns the midpoint index. If the target is less than the middle element, it adjusts the end  pointer to narrow the search to the left half; if greater, it moves the start pointer to focus on the right half. This process repeats until the appropriate insertion index is determined. The algorithm operates with a time complexity of O(log n), as the search interval is halved with each iteration, and a space complexity of O(1), since it requires only a constant amount of additional space
The time complexity : O(log n)

The space complexity : O(1)

*/

class P9 {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;

        while(start<=end){
            int mid = (start + end) /2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
    public static void main(String[] args){
        int nums[] = {1,3,5,7};
        int target = 5;
        P9 solution = new P9(); 
        System.out.println(solution.searchInsert(nums, target));
    }
}
