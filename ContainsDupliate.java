import java.util.HashSet;
import java.util.Set;

class ContainsDupliate {
    public static boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for(int num:nums){
            if (seen.contains(num)){
                return true;
            } else {
                seen.add(num);
            }
        }
        return false;
    }
  public static void main(String[] args){
        int[] x = {3,4,5,6};
        boolean res = ContainsDupliate.hasDuplicate(x);
        System.out.println(res);
    }
}
