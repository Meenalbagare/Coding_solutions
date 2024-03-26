class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        unordered_set<int> set;

        for (int num : nums)    set.insert(num);

        int i = 1;
        while (i <= nums.size()) {
            if (set.find(i) != set.end())   i++;
            else    return i;
        }
        return nums.size() + 1;
    }
};