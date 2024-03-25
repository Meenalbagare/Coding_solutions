class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
        std::unordered_map<int,int> count;
        std::vector<int> res;
        std::vector<int> freq(nums.size()+1,0);
        for (int i:nums){
            count[i]=count[i]+1;
            freq[i]++;
        }
        for(int i=0;i<freq.size();i++){
            if(freq[i]>1){
                res.push_back(i);
            }
        }
        return res;
    }
};