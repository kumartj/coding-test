import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {

    private  static List<List<Integer>> permute(List<Integer> nums) {
        List<List<Integer>> bigList = new ArrayList<>();
        permute(nums, 0, bigList);
        return bigList;
    }

    private static void permute(List<Integer>  nums, int index, List<List<Integer>> bigList) {
        if (index == nums.size()) {
            bigList.add(new ArrayList<>(nums));
            return;
        }
        for (int i = index; i < nums.size(); i++) {
            swap(nums, i, index);
            permute(nums, index + 1, bigList);
            swap(nums, i, index);
        }
    }

    private static void swap(List<Integer> nums, int i, int index) {
        int temp = nums.get(i);
        nums.set(i,nums.get(index));
        nums.set(index, temp);
    }

    public static void main(String[] args) {
        System.out.println("permutation = " +  permute(Arrays.asList(0, 1)));
        System.out.println("permutation 2 = " +  permute(Arrays.asList(1,2 ,3)));
    }

    /**
     * Level 1
         * permute ([1,2,3], 0)
         *  swap(1 ,1 )
         *  permute ([1,2,3], 1)
         *  swap( 1, 1)
         *
         *  i = 1
         *  swap ( 1, 2)
         *  permute (213, 1)
         *  swap(2 ,1 )
         *
         *  i = 2
         *  swap(1 ,3)
         *  permute(312, 1)
         *  swap(3 ,1)
     *  Level 2
     *  permute([1,2,3],  1)
     * i = 1
     * swap(2, 2 )
     * permute([1,2,3], 2)
     * swap(2,2)
     * .....
     */
}
