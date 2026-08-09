class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            int[] cArr = new int[26];
            for(char c : str.toCharArray()){
                cArr[c - 97]++;
            }
            List<String> val = map.getOrDefault(Arrays.toString(cArr), new ArrayList<String>());
            val.add(str);
            map.put(Arrays.toString(cArr), val);
            // System.out.println(Arrays.toString(cArr) + " = " + val);
        }

        return new ArrayList<>(map.values());
    }
}
