class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> result = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if(result.containsKey(difference)) {
                return new int[] {result.get(difference), i};
            } else {
                result.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
