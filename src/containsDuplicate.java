import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {

    public static boolean containsDuplicate(int[] nums){

        Set<Integer> set = new HashSet<>(nums.length);
        for(int x = 0; x < nums.length; x++){
            if(set.contains(nums[x])){
                return true;
            }
            else{
                set.add(nums[x]);
            }
        }
        return false;
    }

    public static void main(String args[]){
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        int[] nums2 = {1,2,3,4,5,6,7};
        boolean bool = containsDuplicate(nums2);
        System.out.println(bool);
    }

}
