class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i < n; i++){
            int current = temperatures[i];
            while(!stack.isEmpty() && current > temperatures[stack.peek()]) {
                int previousIndex = stack.pop();
                result[previousIndex] = i - previousIndex;
            }
            stack.push(i);
        }

        return result;
    }
}
// 30 -> result = [], stack = 0,
// 38 -> result[0] = 1, stack = [1], 
// 30 -> result[0] = 1, stack = [1, 2],
// 36 -> result[0] = 1,  


