class Solution {
    public boolean hasDuplicate(int[] nums) {
        for (int pointer1 = 0; pointer1 < nums.length; pointer1++) {
            for (int pointer2 = pointer1 + 1; pointer2 < nums.length; pointer2++) {
                if(nums[pointer1] == nums[pointer2]) {
                    return true;
                }
            }
        }
        return false;
    }
}