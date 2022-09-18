import java.util.Arrays;

public class productOfArrayExceptSelf{

    public static int[] productExceptSelf(int[] nums){
        int totalProduct = 1;
        int[] answer = new int[nums.length];
        for(int x = 0; x < nums.length; x++){
            totalProduct *= nums[x];
        }



        for(int y = 0; y < nums.length; y++){
            if(answer[y] == 0){
                // zero
            }
            else {
                answer[y] = totalProduct / nums[y];
            }
        }
        return answer;
    }

    public static void main(String args[]){
        int[] input = {1, 2, 3, 4};
        int[] input2 = {-1,1,0,-3,3};
        int[] answer = productExceptSelf(input2);
        System.out.println(Arrays.toString(answer));

    }
}