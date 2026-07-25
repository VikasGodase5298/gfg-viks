class Solution {
    public int lcm(int a, int b) {
        int max = a > b ? a : b;
        int lcm = max;
        
        while(true){
            if(lcm % a == 0 && lcm % b == 0){
                return lcm;
            }
            lcm += max;
        }
    }
}