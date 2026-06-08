class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while(left < right) {
            int mid = left + (right - left) / 2;
            
            if(nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
}


// [3, 4, 1, 2] => [3, 4], [1, 2] ----> min = 1
// left = 0, right = 3 
// - mid = 3/2 = 1 nums[mid] > nums[right] -> left = 2 
// - mid = 2 nums[mid] < nums[right] -> right = 2 