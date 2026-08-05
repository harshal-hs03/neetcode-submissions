class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> mappings = new HashSet<>();
        for(int i : nums){
            if(mappings.contains(i))
                return true;
            mappings.add(i);
        }
        return false;
    }
}