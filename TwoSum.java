import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer,Integer> hmp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if (hmp.get(nums[i])!= null){
                return new int[] {hmp.get(nums[i]),i};
            } else {
                hmp.put((target-nums[i]),i);
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] x = {3,4,5,6};
        int[] res = TwoSum.twoSum(x, 7);
        System.out.println(Arrays.toString(res));
    }
}