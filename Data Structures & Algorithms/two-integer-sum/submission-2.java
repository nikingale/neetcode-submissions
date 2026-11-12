class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        int other = 0;
        int otherIndex = 0;
        int[] result = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            other = target - nums[i];
            if(map.containsKey(other) && i != map.get(other)) {
                otherIndex = map.get(other);
                result[0] = i;
                result[1] = otherIndex;
                return result;
            }
        }
        return result;
    }
}