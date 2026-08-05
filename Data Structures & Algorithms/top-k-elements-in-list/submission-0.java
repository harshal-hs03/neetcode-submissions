class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();

        for(int n : nums)
            count.put(n, count.getOrDefault(n, 0) + 1);

        return count.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder())).limit(k)
        .mapToInt(Map.Entry::getKey).toArray();
    }
}
