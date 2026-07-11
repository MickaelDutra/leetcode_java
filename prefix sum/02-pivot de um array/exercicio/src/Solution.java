import java.util.Arrays;

class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int right = 0;

        for (int i = 0; i < nums.length; i++){
            if(i == 0){
                left = 0;
            }
            if(i == (nums.length - 1)){
                right = 0;
            }

        }
        System.out.println("right: " + right);
        System.out.println("right: " + left);
        return 1;
    }
}