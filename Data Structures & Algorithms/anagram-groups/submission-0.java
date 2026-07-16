class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i =0; i < strs.length; i++) {
            int[] count = new int[26];
            for (char c : strs[i].toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder s = new StringBuilder();
            for (int j = 0; j < count.length; j++) {
                s.append(count[j]).append("#");
            }
            map.putIfAbsent(s.toString(), new ArrayList<>());
            map.get(s.toString()).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}
