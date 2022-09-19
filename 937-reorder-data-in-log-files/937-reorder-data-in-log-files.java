class Solution {
    public String[] reorderLogFiles(String[] logs) {
        /*
        Rules:
        A. 2 letter log
            a. main lexicographically sort
            b. if main is same, id lexicographically sort
        B. 1 letter + 1 digit log: letter always come first
        C. 2 digit log: main tain index order in logs
        */
        
        Arrays.sort(logs, (log1, log2) -> {
            // log 1 < log 2 return -1
            // log 1 = log 2 return 0
            // log 1 > log s return 1
            
            // getting the index of the first space
            int index1 = log1.indexOf(" ");
            
            // extract indentifier of the log
            String id1 = log1.substring(0, index1);
            
            // extract main portion of the log
            String main1 = log1.substring(index1 + 1);
            
            int index2 = log2.indexOf(" ");
            String id2 = log2.substring(0, index2);
            String main2 = log2.substring(index2 + 1);
            
            // check if the log is a digit log
            boolean isDigit1 = Character.isDigit(main1.charAt(0));
            boolean isDigit2 = Character.isDigit(main2.charAt(0));
            
            
            // case 1: both log are letter log
            if (!isDigit1 && !isDigit2) {
                // case 1a: check if main portion is lexicographically sort
                int value = main1.compareTo(main2);
                if (value == 0) return id1.compareTo(id2); // case 1b
                return value;
            }
            
            // at this point there is at least 1 digit log
            if (isDigit1) {
                if (isDigit2) {
                    return 0; // both log
                } else {
                    return 1;
                }
            } else {
                return -1;
            }
            
            
        });
        
        return logs;
    }
}