class Solution(object):
    def reverseWords(self, s):
        words = s.split()
        n = len(words)
        ans = ""

        for i in range(n-1, 0, -1):
            ans+= words[i] + " "
        
        ans+=words[0]
        return ans.strip()
