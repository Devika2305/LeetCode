class Solution {
    public void reverseString(char[] s) {
        if (s.length == 0 || s.length == 1)
            return;
        int n = s.length ;
        for (int i = 0 , j = n - 1 ; i < n/2 ; i++, j--){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        } 
    }
}