class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        sd = {}
        td = {}

        if len(s) != len(t):
            return False


        for i in s:
            if sd.__contains__(i):
                sd[i] += 1
            else:
                sd[i] = 1
        for i in t:
            if td.__contains__(i):
                td[i] += 1
            else:
                td[i] = 1

        for n in s:
            try:
                if sd[n] != td[n]:
                    return False
            except KeyError:
                return False
        return True
