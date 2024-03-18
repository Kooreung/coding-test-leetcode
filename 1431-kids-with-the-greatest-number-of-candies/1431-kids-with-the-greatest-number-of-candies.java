class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandy = candies[0];
        
        for (int i = 1; i < candies.length; i++) {
            if (maxCandy < candies[i]) {
                maxCandy = candies[i];
            }
        }
        
        List<Boolean> candyList = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            if (extraCandies + candies[i] >= maxCandy) {
                candyList.add(true);
            } else {
                candyList.add(false);
            }
        }

        return candyList;
    }
}