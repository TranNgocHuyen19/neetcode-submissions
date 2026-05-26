class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];

        for(int i = 0; i < n; i++){
            int current = temperatures[i];
            int count = 0;
            for(int j = i + 1; j < n; j++) {
                if(current < temperatures[j]){
                    count = j - i;
                    break;
                }
            }
            result[i] = count;
        }
        return result;
    }
}


// [30,38,30,36,35,40,28]
// 30 -> 38 -> result = 1
// 38 -> 30,36,35,40 -> result = 4
// 30 -> 36 -> result = 1 0 
