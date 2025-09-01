class Solution {
    public boolean checkPerfectNumber(int num) {

        int sum = 1;
        int original = num;
        if(num <= 1) return false;
       

        for(int i = 2; i < num; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        return (original == sum);
        
    }
}