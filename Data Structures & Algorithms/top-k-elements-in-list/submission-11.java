class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num: nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for(int key: freq.keySet()) {
            int fre = freq.get(key);
            if(buckets[fre] == null) {
                buckets[fre] = new ArrayList<>();
            }
            buckets[fre].add(key);
        }

        int[] result = new int[k];
        int count = 0;
        for(int i = buckets.length - 1; i > 0; i--){
            if(buckets[i] != null) {
                for (int num: buckets[i]) {
                if(count == k) return result;
                result[count] = num;
                ++count;
                }
            }
        }

        return result;
    }
}

