class Solution {
    public String largestOddNumber(String n) {
        if((int)n.charAt(n.length()-1)%2==1) return n;
        int i=n.length()-1;
        while(i>=0){
            int num=n.charAt(i);
            if(num%2==1) return n.substring(0,i+1);
            i--;
        }
        return "";
    }
}