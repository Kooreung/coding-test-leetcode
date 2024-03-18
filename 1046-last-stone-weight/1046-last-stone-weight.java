class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> stoneList = new ArrayList<>(Arrays.stream(stones).boxed().toList());

        while (stoneList.size() >= 2) {
            stoneList.sort((a, b) -> b - a);
            int max1 = stoneList.remove(0);
            int max2 = stoneList.remove(0);

            int diff = max1 - max2;
            if (diff != 0) {
                stoneList.add(diff);
            }
        }
        if (stoneList.size() == 0) {
            return 0;
        } else {
            return stoneList.get(0);
        }
    }
}