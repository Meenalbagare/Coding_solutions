class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res=new HashMap<>();
        for(String i:strs){
            char[] sortedArr=i.toCharArray();
            Arrays.sort(sortedArr);
            String sortedword=new String(sortedArr);
            res.putIfAbsent(sortedword,new ArrayList<>());
            res.get(sortedword).add(i);
        }
        return new ArrayList<>(res.values());
    }
}