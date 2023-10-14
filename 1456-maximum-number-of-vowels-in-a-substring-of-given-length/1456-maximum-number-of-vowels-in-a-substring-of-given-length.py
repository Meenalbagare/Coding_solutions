class Solution(object):
    def maxVowels(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: int
        """
        vowels = {'a', 'e', 'i', 'o', 'u'}  # Set of vowel letters
        max_count = 0
        count = 0

        for i in range(len(s)):
            if s[i] in vowels:
                count += 1  # Increment count if the current character is a vowel

            if i >= k:
                if s[i - k] in vowels:
                    count -= 1  # Decrement count if the character leaving the window is a vowel

            max_count = max(max_count, count)  # Update max_count with the maximum count found so far

        return max_count