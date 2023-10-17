class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        maxi = 0
        actual = 0
        hash = dict()
        inicio = -1

        for i, letter in enumerate(list(s)):
            if letter == " ":
                letter = "space"
            if letter not in hash:
                hash[letter] = i
                actual += 1

            else:
                num = hash[letter] + 1

                if hash[letter] >= inicio:
                    hash[letter] = i
                    to_add = i - num
                    inicio = i - to_add
                    actual = 1 + to_add
                else:
                    hash[letter] = i
                    actual += 1

            if maxi <= actual:
                maxi = actual
        return maxi
