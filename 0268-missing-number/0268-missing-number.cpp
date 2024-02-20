class Solution {
public:
    int missingNumber(vector<int>& nums) {
        vector<int> v((nums.size())+1,-1);
        for(int i=0;i<nums.size();i++){
            v[nums[i]]=nums[i];
        }
        for(int k=0;k<v.size();k++){
            if(v[k]==-1){
                return k;
            }
        }
        return 0;
    }
};
