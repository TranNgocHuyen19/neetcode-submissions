class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int max = 0;

        while(left < right) {
            int distance = right - left;
            int minHeight = Math.min(heights[left], heights[right]);
            max = Math.max(max, distance * minHeight);

            if(heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }

        }

        return max;
    }
}
