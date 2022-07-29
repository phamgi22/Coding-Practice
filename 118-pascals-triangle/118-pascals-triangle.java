class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row);
        
        for (int i=1; i<numRows; i++) {
            List<Integer> pre_row = triangle.get(i-1);
            List<Integer> cur_row = new ArrayList<>();
            cur_row.add(1);
            
            for (int j=1; j<i; j++) {
                cur_row.add(pre_row.get(j-1) + pre_row.get(j));
            }
            cur_row.add(1);
            triangle.add(cur_row);
        }
        
        return triangle;
    }
}