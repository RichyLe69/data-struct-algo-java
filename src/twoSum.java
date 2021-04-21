//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Output: Because nums[0] + nums[1] == 9, we return [0, 1].

public class twoSum{
    public static void main(String args[]){

        int nums[] = {2,7,11,15};
        int target = 17;

        for(int x = 0; x < nums.length; x++){
            for(int y = x +1; y < nums.length; y++){
                if( nums[x] + nums[y] == target){
                    System.out.println(String.format("%s, %s", nums[x], nums[y])) ;
                }
            }
        }
    }
}

