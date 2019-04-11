class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder answer = new StringBuilder();
        
        if (strs.length == 0)
            return "";
        
        for (int idx = 0; idx< strs[0].length(); idx++)
        {
            char candidate = strs[0].charAt(idx);
            boolean same = true;
            for (int strIdx = 1; strIdx < strs.length; strIdx++)
            {
                //System.out.println(strIdx + " " + idx);
                if (idx >= strs[strIdx].length())
                {
                    same = false;
                    break;
                }
                if(strs[strIdx].charAt(idx) != strs[0].charAt(idx))
                {
                    same = false;
                    break;
                }
            }
            if (same)
            {
                answer.append(candidate);
            }
            else
            {
                break;
            }

        }
        
        return answer.toString();
    }
}
