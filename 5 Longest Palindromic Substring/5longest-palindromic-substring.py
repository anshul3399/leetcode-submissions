def checkPalindrome(string, start, end):
    while (start>=0 and end<len(string) and string[start]==string[end]):
        start-=1
        end+=1
    return (string[start+1:end])

class Solution:
    def longestPalindrome(self, s: str) -> str:
        result = ""
        for i in range(0,len(s)):
            odd = checkPalindrome(s, i, i)
            even = checkPalindrome(s, i, i+1)
            result = max(odd, even, result, key=len) # here max function is selecting the max value from the input given as parameters based on the length of the string (key=len)
        # print(result)
        return result