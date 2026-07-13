class Solution {
    public static int countDigits(int n) {
        int count = 0;
        
        if(n == 0){
            return 1;
        }
        
        while(n != 0){
            int lastDigit = n % 10;
            count = count + 1;
            n = n / 10;
        }
        return count;
    }
}
