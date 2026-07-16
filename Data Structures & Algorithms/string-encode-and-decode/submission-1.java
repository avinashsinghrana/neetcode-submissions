class Solution {

    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();
        for(String st : strs) {
            s.append(st.length()).append("#").append(st);
        }
        return s.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while ( i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));
            res.add(str.substring(j+1, j+1+length));
            i = j+1+length;
        }
        return res;
    }
}
