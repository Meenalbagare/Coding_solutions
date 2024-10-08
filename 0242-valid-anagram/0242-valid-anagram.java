class Solution {
    public boolean isAnagram(String s, String t) {
        // char[] sa=s.toCharArray();
        // char[] ta=t.toCharArray();
        // Arrays.sort(sa);
        // Arrays.sort(ta);
        // return Arrays.equals(sa,ta);
        
        Map<Character,Integer> map=new HashMap<>();
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i))){
                if(map.get(t.charAt(i))==1){
                    map.remove(t.charAt(i));
                }else{
                    map.put(t.charAt(i),map.get(t.charAt(i))-1);
                }
                
            }
        }
        return map.isEmpty();
    }
}
