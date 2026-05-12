class Solution {

    public String encode(List<String> strs) {
        String delimeter1 = "á";
        String delimeter2 = "à";
        String result = "";
        for(String s: strs) {
            if(s == "") {
                result += delimeter1;
            } else {
                result += s + delimeter2;
            }
        }
        return result;
    }
    

    public List<String> decode(String str) {
        String delimeter1 = "á";
        String delimeter2 = "à";
        List<String> result = new ArrayList<>();
        String current = "";
        for(char s: str.toCharArray()) {
            if(s == delimeter1.charAt(0)) {
                result.add("");             
            } else if(s == delimeter2.charAt(0)) {
                result.add(current);
                current = "";
            } else {
                current += s;
            }
        }
        return result;
    }
}

