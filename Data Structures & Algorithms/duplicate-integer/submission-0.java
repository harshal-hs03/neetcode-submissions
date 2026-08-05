class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Boolean> mappings = new HashMap<>();
        for(int i : nums){
            if(mappings.containsKey(i))
                return true;
            else
                mappings.put(i, true);
        }
        return false;
    }
}