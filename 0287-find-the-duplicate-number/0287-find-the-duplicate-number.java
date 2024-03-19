class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int numb = 0;

        for(int num : nums) {
            if(!set.add(num)) {
                numb = num;
            }
        }
        return numb;
    }
}