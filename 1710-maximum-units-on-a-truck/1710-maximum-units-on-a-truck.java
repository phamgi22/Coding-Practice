class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);
        int max = 0;
        
        for (int[] boxType : boxTypes) {
            int loadingBoxes = Math.min(boxType[0], truckSize);
            max += loadingBoxes * boxType[1];
            truckSize -= loadingBoxes;
            if (truckSize == 0) break;
        }
        
        return max;
    }
}