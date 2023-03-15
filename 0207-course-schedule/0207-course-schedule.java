class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> courseDict = new HashMap<>();
        for (int[] relation : prerequisites) {
            if (!courseDict.containsKey(relation[0])) courseDict.put(relation[0], new ArrayList<>());
            courseDict.get(relation[0]).add(relation[1]);
        }
        
        boolean[] checked = new boolean[numCourses];
        boolean[] path = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (this.isCyclic(i, courseDict, path, checked)) return false;
        }
        
        return true;
    }
    
    // backtracking method to check that no cycle would be form starting from currcourse
    
    private boolean isCyclic(Integer i, Map<Integer, List<Integer>> courseDict, boolean[] path, boolean[] checked) {
        if (checked[i]) return false;
        if (path[i]) return true;
        if (!courseDict.containsKey(i)) return false;
        
        path[i] = true;
        boolean ret = false;
        for (Integer child : courseDict.get(i)) {
            ret = isCyclic(child, courseDict, path, checked);
            if (ret) break;
        }
        
        path[i] = false;
        checked[i] = true;
        return ret;
    }
}