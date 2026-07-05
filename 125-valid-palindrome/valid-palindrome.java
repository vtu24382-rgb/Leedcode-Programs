class Solution {
    public boolean isPalindrome(String s) {
        String a=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        int i=a.length()-1;
        int j=0;

        boolean result=false;

        while(j<i){
            if(a.charAt(j)!=a.charAt(i)){
                return false;
            }

            i--;
            j++;
        }

        return true;

    }
}