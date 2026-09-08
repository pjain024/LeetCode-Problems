class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Use Integer instead of int for the HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // If it exists, return the index of the complement and current index
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise, store the current number and its index
            map.put(nums[i], i);
        }
        
        // Return an empty array if no solution is found
        return new int[] {};
    }
}