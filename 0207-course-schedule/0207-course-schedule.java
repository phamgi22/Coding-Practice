class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //
        Map<Integer, List<Integer>> courseDict = new HashMap<>();
        
        
        
        
        // a[0][1]
        // 0: course
        // 1: 0's prerequisite, have to take before taking 0
        for (int[] relation : prerequisites) {
            if (!courseDict.containsKey(relation[0])) courseDict.put(relation[0], new ArrayList<>());
            courseDict.get(relation[0]).add(relation[1]);
        }
        boolean[] checked = new boolean[numCourses];
        boolean[] path = new boolean[numCourses];

        for (int currCourse = 0; currCourse < numCourses; ++currCourse) {
            if (this.isCyclic(currCourse, courseDict, checked, path)) return false;
        }

    return true;
    }
    
     protected boolean isCyclic(
      Integer currCourse, Map<Integer, List<Integer>> courseDict,
      boolean[] checked, boolean[] path) {

    // bottom cases
    if (checked[currCourse])
      // this node has been checked, no cycle would be formed with this node.
      return false;
    if (path[currCourse])
      // come across a previously visited node, i.e. detect the cycle
      return true;

    // no following courses, no loop.
    if (!courseDict.containsKey(currCourse))
      return false;

    // before backtracking, mark the node in the path
    path[currCourse] = true;

    boolean ret = false;
    // postorder DFS, to visit all its children first.
    for (Integer child : courseDict.get(currCourse)) {
      ret = this.isCyclic(child, courseDict, checked, path);
      if (ret)
        break;
    }

    // after the visits of children, we come back to process the node itself
    // remove the node from the path
    path[currCourse] = false;

    // Now that we've visited the nodes in the downstream,
    // we complete the check of this node.
    checked[currCourse] = true;
    return ret;
  }
}