class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq=new int[26];
        boolean[] map=new boolean[26];
        char[] chars=s.toCharArray();
        for(char c:chars){
            freq[c-'a']++;
        }
        Stack<Character> stack=new Stack<>();
        for(char c:chars){
            int index=c-'a';
            freq[index]--;
            if(map[index]==true){
                continue;
            }
            while(!stack.isEmpty() && c<stack.peek() && freq[stack.peek()-'a']>0){
                map[stack.pop()-'a']=false;
            }
            map[index]=true;
            stack.push(c);
        }
        StringBuilder newstr=new StringBuilder("");
        for(char c: stack){
            newstr.append(c);
        }
        return newstr.toString();
    }
}