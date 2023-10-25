class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        b = False
        s = set()

        for num in nums:
            if num not in s:
                s.add(num)
            else:
                b = True
                break
        return b
