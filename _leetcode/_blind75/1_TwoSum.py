class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dictionary = {}
        i = 0
        for num in nums:
            complement = target - num
            if complement in dictionary:
                return [dictionary[complement], i]
            dictionary[num] = i
            i = i + 1
