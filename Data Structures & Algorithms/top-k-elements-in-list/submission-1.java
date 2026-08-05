class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();

        for(int n : nums)
            count.put(n, count.getOrDefault(n, 0) + 1);

        ArrayList<Integer>[] c = new ArrayList[nums.length + 1];

        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            int val = entry.getValue();
            if(c[val] == null)
                c[val] = new ArrayList<Integer>();
            c[val].add(entry.getKey());
        }
        // System.out.println(Arrays.deepToString(c));


        int[] res = new int[k];
        int counter = 0;
        for(int i=nums.length; i>0; i--){
            // System.out.println(c[i]);
            if(c[i] != null){
                // System.out.println(i + "="+c[i].toString());
                for(Integer a : c[i]){
                    // System.out.println(a);
                    if(counter == k)
                        return res;
                    res[counter++] = a;
                }
            }
            if(counter == k)
                        return res;
        }

        return res;
        // return count.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder())).limit(k)
        // .mapToInt(Map.Entry::getKey).toArray();
    }
}
