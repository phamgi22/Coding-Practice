class Solution {

    //2 pointers
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        LinkedList<List<Integer>> sol = new LinkedList<List<Integer>>();

        
//         -1 0 1 2 -1 4
//         -1 -1  0 1 2 4
//          0  1  2 3 4 5   
//          i  l        r
        // for i start from 0, end at i = 3
        // i == 0, this is the beginning element
        // i > 0, this is not the beginning element but this element is not the same as the previous element (greater then due to sorted array)
        for (int i = 0; i < nums.length - 1; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                // calculate the sum of the remaining two element of the triplet
                int target = 0 - nums[i];
                // 
                int left = i + 1;
                int right = nums.length - 1;

                while (left < right) {
                    if (nums[left] + nums[right] == target) {
                        ArrayList<Integer> miniSol = new ArrayList<>();
                        miniSol.add(nums[i]);
                        miniSol.add(nums[left]);
                        miniSol.add(nums[right]);
                        sol.add(miniSol);
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    } else if (nums[left] + nums[right] > target) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }

        return sol;
    }
}
