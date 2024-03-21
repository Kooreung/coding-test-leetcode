class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map <Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer val = map.get(num);
            if(val == null) {
                map.put(num, 1);
            } else {
                map.put(num, val + 1);
            }
        }

        int sum = 0;
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            Integer val = map.get(key);
            int r = val * (val - 1) / 2;
            sum += r;
        }

        return sum;
    }
}