class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();


        for(int num: nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer> descKey = freq.entrySet().stream()
            .sorted((o1, o2) -> o2.getValue() - o1.getValue())
            .map(x -> x.getKey())
            .toList();

        int count = 0;
        int[] result = new int[k];
        for(int i = 0; i < descKey.size(); i++) {
            if(count == k) {
                return result;
            }
            ++count;
            result[i] = descKey.get(i);
        }
        return result;
    }
}