//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Output: Because nums[0] + nums[1] == 9, we return [0, 1].


/* Check every combination that add up to target.
 * Simplest way: Double for loop incrementing and checking all pairs of numbers.
 *
 */
public class twoSum{

    public static int[] twoSum(int[] nums, int target){
        int[] ret = new int[2];
        for(int x = 0; x < nums.length; x++){
            for(int y = x +1; y < nums.length; y++){
                if( nums[x] + nums[y] == target){
                    ret[0] = x;
                    ret[1] = y;
                    return ret;
                }
            }
        }
        return ret;
    }

    public static void main(String args[]){

        int nums[] = {2,7,11,15};
        int target = 9;
        int array[] = twoSum(nums, target);
        System.out.println(String.format("%s, %s", array[0], array[1]));
    }
}

