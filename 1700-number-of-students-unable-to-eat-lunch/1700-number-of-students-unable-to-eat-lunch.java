class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int counter[]=new int[2];
        for (int i:students){
            counter[i]+=1;
        }
        int left=sandwiches.length;
        for (int j:sandwiches){
            if (counter[j]==0){
                break;
            }
            if (left==0){
                break;
            }
            counter[j]-=1;
            left-=1;
        }
        return left;
    }
}