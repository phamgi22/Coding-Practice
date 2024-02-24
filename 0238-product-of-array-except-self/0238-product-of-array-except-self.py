class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [1] * len(nums)
        left = 1
        
        for i in range(0, len(nums)):
            res[i] = left
            left *= nums[i]
            

        right = 1
        for i in range(len(nums) - 1, -1, -1):
            res[i] *= right
            right *= nums[i]
            
        
        return res
        
        
        
#         left = [1] * len(nums)
#         right = [1] * len(nums)
        
#         for i in range(1, len(nums)):
#             left[i] = left[i - 1] * nums[i - 1]
        
        
#         for i in range(len(nums) - 2, -1, -1):
#             right[i] = right[i + 1] * nums[i + 1]
        
        
#         for i in range(len(left)):
#             right[i] *= left[i]
        
#         return right