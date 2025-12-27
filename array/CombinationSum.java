class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(),candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> templist, int[] nums, int remain, int start){
        if(remain<0) return;
        else if(remain==0){
            result.add(new ArrayList<>(templist));
        }else{
            for(int i=start;i<nums.length;i++){
                templist.add(nums[i]);
                backtrack(result, templist, nums, remain-nums[i],i);
                templist.remove(templist.size()-1);
            }
        }
    }
}
