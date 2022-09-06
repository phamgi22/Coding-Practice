// Add all the damages to find required health (Add one to the result because the health should be greater than zero at any time)
// Find the maximum number out of damage array to determine which level to use the armor in.
// To optimally use the armor, we need to use it against the level that causes the most damage. Subtract this from the health to get the minimum required health.
class Solution {
    public long minimumHealth(int[] damage, int armor) {
        long max_damage = 0;
        long min_health = 1;
        
        for (int i = 0; i < damage.length; i++) {
            min_health += damage[i];
            max_damage = Math.max(max_damage, damage[i]);
        }
        
        min_health -= Math.min(armor, max_damage);
        return min_health;
    }
}