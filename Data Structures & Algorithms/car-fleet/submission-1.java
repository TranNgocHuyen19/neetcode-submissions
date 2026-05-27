class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        int cars[][] = new int[n][2];

        for(int i = 0; i < n; i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars, (a, b) -> b[0] - a[0]);

        int fleetCount = 0;
        double currentTime = 0;

        for(int[] car: cars) {
            int pos = car[0];
            int spe = car[1];

            double time = (target - pos) * 1.0 / spe ;

            if(time > currentTime) {
                currentTime = time;
                fleetCount++;
            }
        }

        return fleetCount;
    }
}