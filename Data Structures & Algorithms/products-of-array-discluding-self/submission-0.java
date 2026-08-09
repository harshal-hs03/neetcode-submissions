class Solution {
    public int[] productExceptSelf(int[] nums) {

        int len = nums.length;

        int[] suffix = new int[len];
        suffix[len - 1] = 1;
        for(int i=len-2; i>=0; i--)
            suffix[i] = nums[i+1] * suffix[i+1];

        int[] res = new int[len];
        int[] prefix = new int[len];
        prefix[0] = 1;
        res[0] = prefix[0] * suffix[0];
        for(int i=1; i<len; i++){
            prefix[i] = nums[i-1] * prefix[i-1];
            res[i] = prefix[i] * suffix[i];
        }

        return res;
        // [1,1,2,8]
        // [48,24,6,1]
    }
}  
