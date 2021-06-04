public class Outlier {


    public static void main(String[] args) {

        System.out.println("\"[1,3,4,2,2]\" = " + outlier(new int[]{1, 3, 4, 2, 2}));

    }

    public static int outlier(int[] nums) {
        // Find the intersection point of the two pointer.
        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Find the "entrance" to the cycle.
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return fast;
    }
}
