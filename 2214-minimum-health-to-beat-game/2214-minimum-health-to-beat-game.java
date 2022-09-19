class Solution {
    public long minimumHealth(int[] damage, int armor) {
        long max_damage = 0;
        long min_health = 1;
        
        for (int i = 0 ; i < damage.length; i++) {
            min_health += damage[i];
            max_damage = Math.max(max_damage, damage[i]);
        }
        
        min_health -= Math.min(max_damage, armor);
        return min_health;
    }
}