class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> courseDict = new HashMap<>();
        for (int[] relation : prerequisites) {
            if (!courseDict.containsKey(relation[0])) courseDict.put(relation[0], new ArrayList<>());
            courseDict.get(relation[0]).add(relation[1]);
        }
        
        boolean[] checked = new boolean[numCourses];
        boolean[] path = new boolean[numCourses];
        for (int currCourse = 0; currCourse < numCourses; currCourse++) {
            if (this.isCyclic(currCourse, courseDict, checked, path)) return false;
        }
        
        return true;
    }
    
    private boolean isCyclic(Integer currCourse, Map<Integer, List<Integer>> courseDict, boolean[] checked, boolean[] path) {
        
        if (checked[currCourse]) return false;
        if (path[currCourse]) return true;
        if (!courseDict.containsKey(currCourse)) return false;
        
        path[currCourse] = true;
        boolean ret = false;
        for (Integer child : courseDict.get(currCourse)) {
            ret = this.isCyclic(child, courseDict, checked, path);
            if (ret) break;
        }
        path[currCourse] = false;
        checked[currCourse] = true;
        
        return ret;
    }
}