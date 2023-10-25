class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        mult = 1
        zero_bool = False
        for i in nums:
            if i == 0:
                zero_bool = True
                break

        if zero_bool:
            zeros = 0
            for i in nums:
                if i == 0:
                    if zeros == 1:
                        return [0] * len(nums)
                    else:
                        zeros += 1
                else:
                    mult *= i
            return [mult if i == 0 else 0 for i in nums]

        else:
            for i in nums:
                mult *= i
            return [(mult // i) for i in nums]
