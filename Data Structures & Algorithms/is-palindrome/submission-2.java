class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                newStr.append(Character.toLowerCase(c));
            }
        }
        // return newStr.toString().equals(newStr.reverse().toString());
        int i = 0, j = newStr.length() - 1;
        while(i < j) {
            if (newStr.charAt(i) == newStr.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
