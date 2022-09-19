class Solution {
    public String[] reorderLogFiles(String[] logs) {
        /*
        Rules:
        1. letter come before digit
        2. letter sort lexicographically
        3. if main portion is same in two log, return id portion lexicographically
        4. maintain order of index for digit log
        
        
        Cases:
        1. 2 letter
            a. main portion diff, sort main lexicographically
            b. main portion same, sort id lexicographically
        2. 1 letter + 1 digit: letter always come first
        3. 2 digit: maintain order, 0
        */
        
        Arrays.sort(logs, (log1,log2) -> {
            // log1 < log2 return -1;
            // log1 == log 2 return 0:
            // log1 > log2 return 1
            
            int index1 = log1.indexOf(" ");
            String id1 = log1.substring(0, index1);
            String main1 = log1.substring(index1 + 1);
            
            int index2 = log2.indexOf(" ");
            String id2 = log2.substring(0, index2);
            String main2 = log2.substring(index2 + 1);
            
            
            boolean isDigit1 = Character.isDigit(main1.charAt(0));
            boolean isDigit2 = Character.isDigit(main2.charAt(0));
            
            if (!isDigit1 && !isDigit2) {
                int value = main1.compareTo(main2);
                if (value == 0) return id1.compareTo(id2);
                return value;
            }
            
            
            if (isDigit1) {
                if (isDigit2) {
                    return 0;
                } else {
                    // digit2 a letter, so it come before digit1, digit come after
                    return 1;
                }
            } else {
                return -1;
            }
        });
        
        return logs;
    }
}