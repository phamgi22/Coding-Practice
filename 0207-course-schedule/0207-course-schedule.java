class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> courseDict = new HashMap<>();
        for (int[] relation : prerequisites) {
            if (!courseDict.containsKey(relation[0])) courseDict.put(relation[0], new ArrayList<>());
            courseDict.get(relation[0]).add(relation[1]);
        }
        
        boolean[] cyclic_checked = new boolean[numCourses];
        boolean[] visited = new boolean[numCourses];
        
        for (int course = 0; course < numCourses; course++) {
            if (isCyclic(course, courseDict, cyclic_checked, visited)) return false;
        }
        
        return true;
    }
    
    private boolean isCyclic(Integer course, Map<Integer, List<Integer>> courseDict, boolean[] cyclic_checked, boolean[] visited) {
        
        if (visited[course]) return true;
        if (cyclic_checked[course]) return false;
        if (!courseDict.containsKey(course)) return false;
        
        visited[course] = true;
        boolean ret = false;
        for (Integer child : courseDict.get(course)) {
            ret = isCyclic(child, courseDict, cyclic_checked, visited);
            if (ret) break;
        }
        
        cyclic_checked[course] = true;
        visited[course] = false;
        return ret;
    }
}