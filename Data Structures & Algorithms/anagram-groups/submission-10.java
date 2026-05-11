class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

        for(String str: strs) {
            char[] c = str.toCharArray();
            Arrays.sort(c);

            String key = new String(c);

            if(!result.containsKey(key)) {
                result.put(key, new ArrayList<>());
            }

            result.get(key).add(str);
        }

        return new ArrayList(result.values());
    }

    
}
