class Solution {
    static boolean checkYear(int n) {
        if((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)){
            return true;
        }
        return false;
    }
}