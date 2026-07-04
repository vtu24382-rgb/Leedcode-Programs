class Solution {
    public String addBinary(String a, String b) {
        
        StringBuilder ans=new StringBuilder();

        int i=a.length()-1;

        int j=b.length()-1;

        int count=0;

        while(i>=0 || j>=0 || count>0){

            int sum=count;

            if(i>=0){
                sum+=a.charAt(i--)-'0';
            }

            if(j>=0){
                sum+=b.charAt(j--)-'0';
            }

            ans.append(sum%2);

            count=sum/2;

        }

        return ans.reverse().toString();

    }
}