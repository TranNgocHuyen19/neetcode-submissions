class Solution {
    public int[] productExceptSelf(int[] nums) {
        int output[] = new int[nums.length];
        int left = 1;
        int right = 1;
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            output[i] = left;
            left *= nums[i];
        }

        for(int i = n - 1; i >= 0; i--) {
            output[i] *= right;
            right *= nums[i];
        }

        return output;


    }
}  


// 0   1  2  3
// [1, 2, 4, 6]
// bên trái i * bên phải i 
// [0] 1 -> 2 x 4 x 6  = 48 ->  trái = 1 phải 2 * 4 * 6
// [1] 2 -> 1 x 4 x 6  = 24 ->  trái = 1 phải 4*6 
// [2] 4 -> 1 x 2 x 6  = 12 ->  trái = 1 2 phải 6
// [3] 6 -> 1 x 2 x 4  = 8  -> trái = 1 * 2 * 4 phải 1





