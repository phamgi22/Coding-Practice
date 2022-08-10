class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        /*
        Given:
        - assigned to put some amount of boxes onto one truck
        - 2d array boxtypes
        - boxtypes[i] = [numberOfBoxes, numberOfUnitsPerBox]
        
        - integer truckSize, the  max number of boxes that can be put on the truck
        - can choose any  boxes  to  put on the truck  as long as the number of boxes does not exceed truckSize
        - return max units can be put on truck
        */
        
        Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);
        
        int unitCount = 0;
        
        for (int[] boxType : boxTypes) {
            int boxCount = Math.min(truckSize, boxType[0]);
            unitCount += boxCount * boxType[1];
            truckSize -= boxCount;
            if (truckSize == 0) break;
        }
        
        return unitCount;
    }
}