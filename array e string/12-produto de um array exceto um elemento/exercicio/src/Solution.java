
class Solution {
    public int[] productExceptSelf(int[] nums) {
//          Essa foi minha primeira resposta porém não abrange a regra do runs in O(n) time
//        int[] result = new int[nums.length];
//
//        for (int i = 0; i < nums.length; i++){
//            result[i] = 1;
//            for (int j = 0; j <nums.length; j++){
//                if (j != i){
//                    result[i] *= nums[j];
//                }
//            }
//        }
//        return result;
//    }

        int n = nums.length;
        int[] ans = new int[n];
        int[] pre = new int[n];
        int[] suff = new int[n];
        pre[0] = 1;
        suff[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] * nums[i + 1];
        }


        for (int i = 0; i < n; i++) {
            ans[i] = pre[i] * suff[i];
        }
        return ans;
    }
}