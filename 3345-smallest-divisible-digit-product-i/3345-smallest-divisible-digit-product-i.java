class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            if(prod(n)%t == 0)
                return n;
            n++;
        }
    }
    public int prod(int num){
        int pro=1;
        while(num>0){
            int rem=num%10;
            pro=pro*rem;
            num/=10;
        }
        return pro;
    }
}