class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        int result = 0;

        for (int numb : nums) {
            treeSet.add(numb);
        }

        if (treeSet.size() >= 3) {
            result = treeSet.lower(treeSet.lower(treeSet.getLast()));
        } else if (treeSet.size() < 3) {
            result = treeSet.getLast();
        }
        return result;
    }
}