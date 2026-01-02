import java.util.*;
class RemoveOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the values of the array:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the value :");
        int val = sc.nextInt();
        int k = removeall(nums, val);
        System.out.println("Output : "+ k);
    }
    public static int removeall(int[] nums, int val){
        int b = nums.length;
        int c = 0;
        for(int i = 0; i < b; i++){
            if(nums[i] != val){
                c++;
            }
        }
        return c;
    }
}
