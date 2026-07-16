class Solution {

    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();
        for(String st : strs) {
            s.append(st).append(st.length()).append("#");
        }
        return s.toString();
    }

    public List<String> decode(String str) {
         String[] s = str.split("[0-9]#");
         if (s.length == 0)
            return List.of("");
        return List.of(s);
        
        // List<String> res = new ArrayList<>();
        // int i = 0;
        // while ( i < str.length()) {

        // }
    }
}
