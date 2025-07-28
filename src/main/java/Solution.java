class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int target = 0;
        for(int x : nums){
            target |= x;
        }

        return dfs(nums, target, 0, 0);
    }
    int dfs(int[] nums, int target, int cur, int i) {
        if(cur == target) {
            return (int) Math.pow(2, nums.length - i);
        }
        if(i == nums.length) {
            return 0;
        }

        return dfs(nums, target, cur | nums[i], i + 1 ) + dfs(nums, target, cur, i + 1);

    }
}
/**/