class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sSorted = s.toCharArray();
        Arrays.sort(sSorted);
        char[] tSorted = t.toCharArray();
        Arrays.sort(tSorted);
        return Arrays.equals(sSorted,tSorted);
    }
}