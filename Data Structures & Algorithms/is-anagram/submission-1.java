class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();

        for(Character c : s.toCharArray()) {
            map.merge(c, 1, (k, v) -> v + 1);
        }

        for(Character c : t.toCharArray()) {
            if(!map.containsKey(c)) {
                return false;
            }
            map.computeIfPresent(c, (k, v) -> v - 1);
        }
        return true;
    }
}
