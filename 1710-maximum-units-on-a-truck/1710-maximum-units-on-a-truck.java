class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int size=0;
        
        for(int i=0;i<boxTypes.length;i++){
            size+=boxTypes[i][0];
        }
        int[] temp=new int[size];
        int k=0,j=0;
        while(k<=size && j<boxTypes.length){
            int l=boxTypes[j][0];
            while(l>0){
                temp[k]=boxTypes[j][1];
                k++;
                l--;
            }
            
            j++;
            
        }
        Arrays.sort(temp);
        int ans=0;
        if(size>truckSize){
            for(int o=temp.length-1;o>=temp.length-truckSize;o--){
            ans+=temp[o];
            }
        }
        else{
            for(int m=0;m<boxTypes.length;m++){
                ans+=(boxTypes[m][0]*boxTypes[m][1]);
            }
        }   
        
        return ans;
        
        
    }
}