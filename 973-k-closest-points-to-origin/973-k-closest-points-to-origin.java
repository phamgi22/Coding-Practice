class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // distance between point a(x,y) to origin(0,0)
        // calculation formula: (difference between two x coordinate) square + (difference between two y coordinate) square
        //                       and then all together squareroot
        // but if we think about it, for example, 4 < 9
        //                                     squareRoot(4) is still < squareRoot(9)
        //                           for any number, which is less then the other number (both number must be positive)
        //                                     its square root will still be less than the other number
        //                                     therefore we can skip squareroot and save us an operation
        
        
        // we are calculating a special case here, where we want distance between a(x,y) to origin(0,0)
        // because origin coordinate 0,0 we can omit it in our operation
        //                 distance = (x - 0)square + (y - 0) square
        //                             x^2 + y^2 
        // our final distance formula:      x^2 + y^2

        
        
        // we want to sort queue in ascending order ===> a,b where we compare a and b euclidian distance
        //
        // we want to sort queue in descending order===> b,a
        
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> (b[0]*b[0]+b[1]*b[1]) - (a[0]*a[0]+a[1]*a[1]));
        for (int[] point : points) {
            queue.offer(point);
            if (queue.size() > k) queue.remove();
        }
        
        
        int[][] result = new int[k][2];
        while (k > 0) {
            k--;
            result[k] = queue.remove();
            
        }
        
        return result;
                                            
    }
}