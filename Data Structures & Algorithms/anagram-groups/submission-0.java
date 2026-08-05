class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] cArr = str.toCharArray();
            Arrays.sort(cArr);
            String sorted = new String(cArr);
            List<String> list = map.getOrDefault(sorted, new ArrayList<String>());
            list.add(str);
            map.put(sorted, list);
        }

        List<List<String>> result = new ArrayList<>();
        for(List<String> ll : map.values())
            result.add(ll);
        
        return result;
    }
}
