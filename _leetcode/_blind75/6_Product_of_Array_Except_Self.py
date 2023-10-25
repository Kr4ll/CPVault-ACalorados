class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        mult = 1
        nums_s = set(nums)


        if 0 in nums_s:
            zeros = 0
            for i in nums:
                if i == 0:
                    if zeros == 1:
                        return [0]*len(nums)
                    else:
                        zeros += 1
                else:
                    mult *= i
            return [mult if i == 0 else 0 for i in nums]

        else:
            for i in nums:
                mult *= i
            return [int(mult/i) for i in nums]
