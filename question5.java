/* 
5. https://www.geeksforgeeks.org/problems/second-largest3735/1

A detailed explanation of solution
The program begins by verifying whether the array contains fewer than two elements; if so, it returns -1. It then sets largest  to the first element and secondlargest to -1. As it iterates through the array, it updates largest and secondlargest  based on the current element's value. If an element exceeds largest,secondlargest is updated to the previous largest, and largest is set to the current element. If an element is smaller than largest but larger than secondlargest,secondlargest is updated to this element. After completing the loop, the program returns secondlargest, or -1 if a second largest value is not found.
This approach efficiently identifies the second largest element in a single pass through the array, resulting in a time complexity of O(n) and a space complexity of O(1)


The time complexity : O(n)

The space complexity : O(1)

*/

public class question5 {
    public int secondLargest(int[] arr) {
        int lar = -1;
        int secLar = -1;
    
        for(int ele : arr){
            if(ele>lar){
                secLar = lar;
                lar = ele;
            }
            else if(ele>secLar && ele<lar){
                secLar=ele;
            }

        }
        return secLar;
    }   

    public static void main(String[] args) {
        question5 solution = new question5();
        int[] arr = {10, 5, 20, 8};  // Example input
        int result = solution.secondLargest(arr);
        System.out.println("Second Largest Element: " + result);  // Output the result
    }
}
