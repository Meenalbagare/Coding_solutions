class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int mini=Integer.MAX_VALUE;
        List<List<Integer>> lst=new ArrayList<>();
        Arrays.sort(arr);
        int n=arr.length;
      
        for(int i=1;i<n;i++){
            mini=Math.min(Math.abs(arr[i-1]-arr[i]),mini);
        }
        for(int i=1;i<n;i++){
            int d=Math.abs(arr[i-1]-arr[i]);
            if(d==mini){
                lst.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return lst;
    }
}