class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> values = new HashSet<>();
    
        for (int index = 0; index < nums.length; index++) {
            if(values.contains(nums[index])) {
                return true;
            }
            else {
                values.add(nums[index]);
            }
        }
        return false;
    }
}