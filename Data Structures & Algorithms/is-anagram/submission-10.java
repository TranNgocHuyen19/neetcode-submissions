class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;

        Map<Character, Integer> freq1 = new HashMap<>();
        Map<Character, Integer> freq2 = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);

            freq1.put(s1, freq1.getOrDefault(s1, 0) + 1);
            freq2.put(t1, freq2.getOrDefault(t1, 0) + 1);
        }

        if(freq1.equals(freq2)) 
            return true;
        return false;
        
    }
}
