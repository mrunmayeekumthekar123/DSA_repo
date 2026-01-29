class Solution {
    public List<Integer> grayCode(int n) {
        int x = 1 << n; 
        List<Integer> list = new ArrayList<>(x);
        for (int i = 0; i < x; i++) {
            list.add(i ^ (i >> 1));
        }
        return list;
    }
}
