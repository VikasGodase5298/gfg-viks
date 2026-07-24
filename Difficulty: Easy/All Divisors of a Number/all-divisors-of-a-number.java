class Solution {
    public ArrayList<Integer> getDivisors(int n){
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=1; i*i<=n; i++){
            if(n % i == 0){
                result.add(i);
            
            if(n/i != i){
                result.add(n/i);
            }
        }
    }
        
        Collections.sort(result);
        return result;
    }
}

