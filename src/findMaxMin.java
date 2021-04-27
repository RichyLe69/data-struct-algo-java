


public class findMaxMin{
    public static void main(String args[]){
        int[] input = {0, 4, 11, 12, 5, 8, 3, 69, -5, 32, 4, 15};
        int length = input.length;
        int max = input[0];
        int min = input[0];

        for(int x = 1; x < length; x++){
            if (input[x] > max){
                max = input[x];
            }
            if (input[x] < min){
                min = input[x];
            }
        }
        System.out.println(String.format("Max: %s, Min: %s", max, min));
    }
}