class Solution {
    public int strStr(String haystack, String needle) {

        int n=haystack.length()-needle.length();

        for(int i=0;i<=n;i++){
            if(haystack.substring(i,i+needle.length()).equals(needle)){
                return i;
            }
        }

        return -1;
        
    }
}