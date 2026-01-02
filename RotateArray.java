
import java.util.*;
class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the array values one by one:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the k value:");
        int k = sc.nextInt();
        nums = rotate(nums, k);
        System.out.println("Output:")
        for(int i = 0; i < n; i++){
            System.out.print(nums[i] + " ");
        }
        sc.close();
    }

    public static int[] rotate(int[] nums, int k){
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        return nums;
    }

    public static void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

    
// example 1
// input: nums = [1,2,3,4,5,6,7], k = 3
// output = [5,6,7,1,2,3,4]


