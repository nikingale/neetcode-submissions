class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        List<Integer> triplet = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                    if (nums[i] + nums[j] + nums[k] == 0 && !triplets.contains(triplet)) {
                        triplets.add(triplet);
                    }
                }
            }
        }
        return triplets;
    }
}