class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int longestLength = 0;

        HashSet<Integer> input = new HashSet<>();

        for(int num: nums) {
            input.add(num);
        }

        for(int num: nums) {
            if(!input.contains(num - 1)){
                int currentNum = num;
                int currentLength = 1;
                while(input.contains(currentNum + 1)) {
                    ++currentLength;
                    ++currentNum;
                }
                longestLength = Math.max(longestLength, currentLength);
            }
        }

        return longestLength;
    }
}
