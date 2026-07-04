class Solution {
    public int lengthOfLastWord(String s) {

        String[] a=s.split(" ");

        int n=a[a.length-1].length();

        return n;
        
    }
}