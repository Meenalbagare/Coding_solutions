class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> v=new ArrayList<>();
        for(int i=1;i<=9;i++){
            int num=i;
            int nxtdigit=i+1;
            while(num<=high && nxtdigit<=9){
                num=num*10+nxtdigit;
                if(low<=num && num<=high) v.add(num);
                
                ++nxtdigit;
            }
        }
        v.sort(null);
        return v;
    }
}