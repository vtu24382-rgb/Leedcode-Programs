class Solution {
    public String reverseByType(String s) {

        StringBuilder letters = new StringBuilder();
        StringBuilder special = new StringBuilder();

        // Collect letters and special characters
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                letters.append(c);
            } else {
                special.append(c);
            }
        }

        letters.reverse();
        special.reverse();

        StringBuilder ans = new StringBuilder();

        int i = 0, j = 0;

        // Rebuild the string
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                ans.append(letters.charAt(i++));
            } else {
                ans.append(special.charAt(j++));
            }
        }

        return ans.toString();
    }
}