package DSA.Array;
import java.util.*;
public class BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        BuildArrayFromPermutation sol = new BuildArrayFromPermutation();  
        int[] result = sol.buildArray(nums);
 
        System.out.println("Resulting array: " + Arrays.toString(result));
    }
}
