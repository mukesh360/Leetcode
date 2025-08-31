class Solution {
    public int countDigits(int n) {
        
        int count = 0;
        
        while(n > 0){
            int lastDigit = n % 10;
            n = n / 10;
            count ++;
             
             
         }
         
         return count;
        
        
        
    }
}
