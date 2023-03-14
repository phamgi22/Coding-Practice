class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int current_gas_minus_cost = 0;
        int total_gas_minus_cost = 0;
        int position = 0;
        
        for (int i = 0; i < cost.length; i++) {
            current_gas_minus_cost += gas[i] - cost[i];
            total_gas_minus_cost += gas[i] - cost[i];
            if (current_gas_minus_cost  < 0) {
                position = i + 1;
                current_gas_minus_cost = 0;
            }
        }
        
        
        return total_gas_minus_cost < 0 ? -1 : position;
    }
}