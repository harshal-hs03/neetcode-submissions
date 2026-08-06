class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs)
            sb.append(str.length() + "#" + str);

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder(str);

        while(sb.length() != 0){
            int count = Integer.parseInt(sb.substring(0, sb.indexOf("#")));
            int startIndex = sb.indexOf("#") + 1;
            String s = sb.substring(startIndex, startIndex + count);
            res.add(s);
            sb.delete(0, startIndex + count);
        }

        return res;

        // int count = Character.getNumericValue(str.charAt(0));
        // int[] wordCount = new int[count];       // |len1|len2|...|
        
        // for(int i=0; i<count; i++)
        //     wordCount[i] = Character.getNumericValue(str.charAt(i + 1));
        
        
        // int startIndex = count + 1, endIndexOfLastWord = 0;
        // for(int i=0; i<count; i++){
        //     // int startIndex = endIndexOfLastWord + count + 1 + i;
        //     StringBuilder sb = new StringBuilder();
        //     endIndexOfLastWord = startIndex + wordCount[i];
        //     sb.append(str.substring(startIndex, endIndexOfLastWord));
        //     res.add(sb.toString());
        //     startIndex = endIndexOfLastWord;
        // }

        // return res;
    }
}
