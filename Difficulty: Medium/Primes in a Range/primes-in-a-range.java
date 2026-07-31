import java.util.*;
import java.util.ArrayList;

class Solution {
    public boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
            return false;
            } 
        }
        return true;
    }
    public ArrayList<Integer> primeRange(int l, int r) {
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i=l; i<=r; i++){
            if(isPrime(i)){
                res.add(i);
            }
        }
        return res;
    }
}