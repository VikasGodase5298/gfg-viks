class Solution {
    static boolean armstrongNumber(int n) {
        int original = n;
        int sum = 0;
        int count = 0;
        
        while(n != 0){
            int ld = n % 10;
            count += 1;
            n /= 10;
        }
        
        n = original;
        
        while(n > 0){
            int ld = n % 10;
            sum = sum + (int)Math.pow(ld, count);
            n /= 10;
        }
        
        if(original == sum){
            return true;
        } else {
            return false;
        }
    }
}