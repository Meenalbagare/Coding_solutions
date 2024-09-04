class Solution {
    public int reverse(int x) {
        int rev=0;
        int maxInt=Integer.MAX_VALUE;
        int minInt=Integer.MIN_VALUE;
        while(x!=0){
            int d=x%10;
            
            if((rev==maxInt/10 && d>7) || rev>maxInt/10) return 0;
            if((rev==minInt/10 && d<-8) || rev<minInt/10) return 0;
            rev=(rev*10)+d;
            x=x/10;
        }
        return rev;
    }
}