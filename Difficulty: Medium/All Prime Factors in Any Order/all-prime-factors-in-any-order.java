class Solution {
    ArrayList<Integer> primeFactors(int n) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                while(n % i == 0){
                    n = n/i;
                    res.add(i);
                }
            }
        }
        if(n != 1){
            res.add(n);
        }
        return res;
    }
}
