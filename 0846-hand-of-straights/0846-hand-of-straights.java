class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;
        
        TreeMap<Integer, Integer> card_counts = new TreeMap<>();
        
        for (int card : hand) {
            if (!card_counts.containsKey(card)) card_counts.put(card, 1);
            else card_counts.replace(card, card_counts.get(card) + 1);
        }
        
        while (card_counts.size() > 0) {
            int min = card_counts.firstKey();
            for (int card = min; card < min + groupSize; card++) {
                if (!card_counts.containsKey(card)) return false;
                int count = card_counts.get(card);
                if (count == 1) card_counts.remove(card);
                else card_counts.replace(card, count - 1);
            }
        }
        
        return true;
    }
}