class Solution {
    public boolean isSameAfterReversals(int num) {
        
        int original = num; 

        int reverse1 =0;

        while(num!=0){
            int digit = num%10;

            reverse1 = reverse1*10 + digit;

            num= num/10;
        }

        int reverse2 = 0;

        while(reverse1!=0){
            int digit = reverse1%10;

            reverse2 =reverse2 * 10+ digit;

            reverse1 = reverse1/10;
            
        }
        return original == reverse2;
    }
}