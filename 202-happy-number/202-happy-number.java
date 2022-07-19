class Solution {
    public boolean isHappy(int n) {
        int sum,rem;
        while(n!=1 && n!=4){
            sum=0;
            while(n>0){
                rem=n%10;
                sum=sum+(rem*rem);
                n=n/10;
            }
            n=sum;
        }
        if(n==4){
            return false;
        }
        return true;
    }
}