class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        List<Integer> list = new ArrayList<>();
        int[] result = new int[2];

        while(left < right) {
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                list.add(left + 1);
                list.add(right + 1);
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
