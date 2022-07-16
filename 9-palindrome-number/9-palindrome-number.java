class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int sum=0;
        while(x>0){
            int d=x%10;
            sum=sum*10+d;
            x=x/10;
        }
        if(n==sum)
            return true;
        else
            return false;
    }
}