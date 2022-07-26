class Solution {
    //REVERSE FUNCTION
    void r(int arr[], int l, int h)
    {
        while(l<h)
        {
            int temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            
            l++;
            h--;
        }
    }
    public void rotate(int[] arr, int k) {
        
        //IF K IS GREATER THAN ARRAY LENGTH
        //THEN IT IS A COMPLETE ROTATION 
        //SO WE DO THIS
        k = k%arr.length;
        
        r(arr, 0, arr.length-1);
        r(arr, 0, k-1);
        
        r(arr, k, arr.length-1);
    }
}