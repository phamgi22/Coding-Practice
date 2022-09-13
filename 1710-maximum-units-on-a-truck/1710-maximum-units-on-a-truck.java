class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> (b[1] - a[1]));
        int maxUnit = 0;
        
        for (int[] boxType : boxTypes) {
            int boxes = Math.min(boxType[0], truckSize);
            maxUnit += boxes * boxType[1];
            truckSize -= boxes;
            
            if (truckSize == 0) break;
        }
      
        return maxUnit;
    }
}