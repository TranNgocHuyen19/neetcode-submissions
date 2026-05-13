class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int longest = 0;

        HashSet<Integer> input = new HashSet<>();

        for(int num: nums) {
            input.add(num);
        }

        for(int i = 0; i < n; i++) {
            int current = nums[i];
            int currentLength = 1;

            for(int j = 0; j < n; j ++) {
                if(input.contains(current + 1)) {
                    ++currentLength;
                    ++current;
                }
            }
            longest = Math.max(currentLength, longest);
        }

        return longest;
    }
}
