class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(results, new ArrayList<>(),candidates,target,0);
        return results;
    }

    private void backtrack(List<List<Integer>> results, List<Integer> templist, int[] nums, int remain, int start){
        if(remain==0){
            results.add(new ArrayList<>(templist));
            return;
        }

        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]) continue;

            if(nums[i]>remain) break;

            templist.add(nums[i]);
            backtrack(results,templist,nums, remain-nums[i],i+1);
            templist.remove(templist.size()-1);
        }
    }
}
