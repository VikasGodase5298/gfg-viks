class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        //Brute Force
        /*Arrays.sort(arr);
        int largest = arr[arr.length - 1];
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i] != largest){
                return arr[i];
            }
        }
        return -1;  */
        
        //Better Approach
        /* int n = arr.length;
        int largest = arr[0];
        if(n < 2){
            return -1;
        }
        for(int i=0; i<n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        int s_largest = -1;
        for(int i=0; i<n; i++){
            if(arr[i] > s_largest && arr[i] != largest){
                s_largest = arr[i];
            }
        }
        return s_largest; */
        
        //Optimal Approach
        int n = arr.length;
        int largest = arr[0];
        int s_largest = -1;
        if(n < 2){
            return -1;
        }
        for(int i=1; i<n; i++){
            if(arr[i] > largest){
                s_largest = largest;
                largest = arr[i];
            } else if(arr[i] < largest && arr[i] > s_largest){
                s_largest = arr[i];
            }
        }
        return s_largest;
    }
}
