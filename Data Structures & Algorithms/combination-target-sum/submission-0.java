class Solution {

    public List<List<Integer>> combinationSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, target, 0);

        return result;
    }

    private void backtrack(
        List<List<Integer>> result,
        List<Integer> current,
        int[] nums,
        int target,
        int start
    ) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = start; i < nums.length; i++) {

            int num = nums[i];

            current.add(num);

            backtrack(result, current, nums, target - num, i);

            current.remove(current.size() - 1);
        }
    }
}