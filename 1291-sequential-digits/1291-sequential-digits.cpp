class Solution {
public:
    vector<int> sequentialDigits(int low, int high) {
        vector<int> v;
        for(int i=1;i<=9;i++){
            int num=i;
            int nxtdigit=i+1;
            while(num<=high && nxtdigit<=9){
                num=num*10+nxtdigit;
                if(num>=low && num<=high) v.push_back(num);
                ++nxtdigit;
            }
        }
        sort(v.begin(),v.end());
        return v;
    }
};

