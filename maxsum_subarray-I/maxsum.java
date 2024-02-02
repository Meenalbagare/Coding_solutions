
//MAXSUM SUBARRAY ->PREFIX SUM

public class java{
    public static void maxsum(int a[]){
        int prefix[]=new int[a.length];
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;
        prefix[0]=a[0];
        for(int i=1;i<a.length;i++){
            prefix[i]=prefix[i-1]+a[i];
        }
        for(int i=0;i<a.length;i++){
            curSum=0;
            for(int j=i;j<a.length;j++){
                curSum=i==0 ? prefix[j] : prefix[j]-prefix[i-1]; 

            }
            if(maxSum<curSum){
                maxSum=curSum;
            }
        
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args){
        int a[]={1,-2,6,-1,3};
        maxsum(a);
    }
}
