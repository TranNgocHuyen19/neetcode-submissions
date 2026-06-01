class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // int maxPile = 0;

        // for (int i = 0; i < piles.length; i++) {
        //     maxPile = Math.max(maxPile, piles[i]);
        // }

        // for (int i = 1; i <= maxPile; i++) {
        //     int hours = 0;

        //     for (int j = 0; j < piles.length; j++) {
        //         hours += Math.ceil((double)piles[j] / i);
        //     }

        //     if (hours <= h) {
        //         return i;
        //     }
        // }

        // return maxPile;

        int maxPile = 0;

        for (int i = 0; i < piles.length; i++) {
            maxPile = Math.max(maxPile, piles[i]);
        }

        int left = 1;
        int right = maxPile;
        int k = 0;

        while(left <= right) {
            int mid = (left + right) / 2;
            int hours = 0;

            for(int i = 0; i < piles.length; i++) {
                hours += Math.ceil((double)piles[i] / mid);
            }

            if(hours <= h) {
                k = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return k;
    }
}
