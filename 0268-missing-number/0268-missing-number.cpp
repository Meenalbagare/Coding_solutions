import java.util.List;
class Solution {
    public int missingNumber(int[] nums) {
        int[] v=new int[(nums.length)+1];
        Arrays.fill(v,-1);
        for(int i=0;i<nums.length;i++){
            v[nums[i]]=nums[i];
        }
        for(int j=0;j<v.length;j++){
            if(v[j]==-1){
                return j;
            }
        }
        return 0;
        
    }
}
 