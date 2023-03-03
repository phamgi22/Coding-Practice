class Solution {
  public boolean canFinish(int numCourses, int[][] prerequisites) {
    HashMap<Integer, List<Integer>> courseDict = new HashMap<>();
    for (int[] relation : prerequisites) {
      if (courseDict.containsKey(relation[1])) {
        courseDict.get(relation[1]).add(relation[0]);
      } else {
        List<Integer> nextCourses = new LinkedList<>();
        nextCourses.add(relation[0]);
        courseDict.put(relation[1], nextCourses);
      }
    }
    boolean[] checked = new boolean[numCourses];
    boolean[] path = new boolean[numCourses];
    for (int currCourse = 0; currCourse < numCourses; ++currCourse) {
      if (this.isCyclic(currCourse, courseDict, checked, path))
        return false;
    }
    return true;
  }


  protected boolean isCyclic(
      Integer currCourse, HashMap<Integer, List<Integer>> courseDict,
      boolean[] checked, boolean[] path) {
    if (checked[currCourse])return false;
    if (path[currCourse])return true;
    if (!courseDict.containsKey(currCourse)) return false;
    path[currCourse] = true;
    boolean ret = false;
    for (Integer child : courseDict.get(currCourse)) {
      ret = this.isCyclic(child, courseDict, checked, path);
      if (ret)break;
    }
    path[currCourse] = false;
    checked[currCourse] = true;
    return ret;
  }
}