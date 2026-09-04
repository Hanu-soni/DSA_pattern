// You are given an integer array nums and two integers indexDiff and valueDiff.

// Find a pair of indices (i, j) such that:

// i != j,
// abs(i - j) <= indexDiff.
// abs(nums[i] - nums[j]) <= valueDiff, and
// Return true if such pair exists or false otherwise.

 

// Example 1:

// Input: nums = [1,2,3,1], indexDiff = 3, valueDiff = 0
// Output: true
// Explanation: We can choose (i, j) = (0, 3).
// We satisfy the three conditions:
// i != j --> 0 != 3
// abs(i - j) <= indexDiff --> abs(0 - 3) <= 3
// abs(nums[i] - nums[j]) <= valueDiff --> abs(1 - 1) <= 0
// Example 2:

// Input: nums = [1,5,9,1,5,9], indexDiff = 2, valueDiff = 3
// Output: false
// Explanation: After trying all the possible pairs (i, j), 
// we cannot satisfy the three conditions, so we return false.

class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeMap<Long,Integer> map = new TreeMap<>();
        for(int i=0;i<nums.length;i++){

            //calculate val differnece
           Long high = nums[i] + (long)valueDiff;
            Long low = nums[i] - (long)valueDiff;
            //find a number in map which is greater than or equal to low
            Long req=map.ceilingKey(low);
            if(req!=null && req<=high)
            {
                return true;
            }

            
            Long value=(long)nums[i];
            map.put(value,i);
            if(map.size()>indexDiff){
                //Long removed=;
                map.remove((long)nums[i-indexDiff]);
            }
        }
        return false;
        
    }
}