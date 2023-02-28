class Solution {
    private List<String> combinations = new ArrayList<>();
    private Map<Character, String> letters = new HashMap<>();
    public Solution() {
        letters.put('2', "abc");
        letters.put('3', "def");
        letters.put('4', "ghi");
        letters.put('5', "jkl");
        letters.put('6', "mno");
        letters.put('7', "pqrs");
        letters.put('8', "tuv");
        letters.put('9', "wxyz");

    }
    

    private String phoneDigits;
    
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return combinations;
        }
        
        phoneDigits = digits;
        backtrack(0, new StringBuilder());
        return combinations;
    }
    
    private void backtrack(int index, StringBuilder path) {
        if (path.length() == phoneDigits.length()) {
            combinations.add(path.toString());
            return;
        }
        
        String possibleLetters = letters.get(phoneDigits.charAt(index));
        for (char letter: possibleLetters.toCharArray()) {
            path.append(letter);
            backtrack(index + 1, path);
            path.deleteCharAt(path.length() - 1);
        }
    }
}