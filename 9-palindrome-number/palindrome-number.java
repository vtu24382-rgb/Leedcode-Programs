class Solution {
    public boolean isPalindrome(int x) {

        String s=Integer.toString(x);
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}