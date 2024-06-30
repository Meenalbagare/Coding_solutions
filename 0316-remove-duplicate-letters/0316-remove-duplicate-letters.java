class Solution {
    public String removeDuplicateLetters(String s) {
        int[] count = new int[26]; // Count of each character in the string
        boolean[] visited = new boolean[26]; // Whether a character is in the result stack
        char[] chars = s.toCharArray();
        
        // Count the frequency of each character
        for (char c : chars) {
            count[c - 'a']++;
        }
        
        Stack<Character> stack = new Stack<>();
        
        for (char c : chars) {
            int index = c - 'a';
            count[index]--;
            
            // If character is already in the stack, continue to the next character
            if (visited[index]) {
                continue;
            }
            
            // Ensure the characters in the stack are in increasing order
            // If the current character is smaller than the last character in the stack
            // and the last character appears later in the string, we can pop it
            while (!stack.isEmpty() && c < stack.peek() && count[stack.peek() - 'a'] > 0) {
                visited[stack.pop() - 'a'] = false;
            }
            
            // Add current character to the stack and mark it as visited
            stack.push(c);
            visited[index] = true;
        }
        
        // Build the result string from the stack
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }
        
        return result.toString();
    }
}