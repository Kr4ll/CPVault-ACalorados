class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        d = {}
        result = []
        for elem in nums:
            if elem in d:
                d[elem] += 1
            else:
                d[elem] = 1
        q = sorted(d.items(), key=lambda kv: kv[1], reverse=True)
        for i in range(0, k):
            result.append(q[i][0])

        return result
