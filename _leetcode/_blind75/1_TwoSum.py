class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map = dict()
    
        for i, num in enumerate(nums):
            if num in map:
                return [map[num], i]
            else:
                map[(target - num)] = i
