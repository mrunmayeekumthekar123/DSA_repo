class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums, new boolean[nums.length]);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> templist, int[] nums, boolean[] used){
        if(templist.size()==nums.length){
            list.add(new ArrayList<>(templist));
            return;
        }
        for(int i=0; i<nums.length;i++){
            if(used[i]) continue;

            used[i]=true;
            templist.add(nums[i]);
            backtrack(list,templist,nums,used);

            used[i]=false;
            templist.remove(templist.size()-1);
        }
    }
}
