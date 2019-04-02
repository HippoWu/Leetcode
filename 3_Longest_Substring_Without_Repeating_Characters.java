import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        char ch[] = s.toCharArray();
        long length = ch.length;
        int longest = 0;
        int temp_longest = 0;
        boolean has_wht_sp = false;
        int idx = 0;
        
        HashMap<Character, Character> sub_str = new HashMap<>();
        
        while (idx < length)
        {                
            //System.out.println(sub_str.containsValue(ch[idx]) + " " + Character.isWhitespace(ch[idx]));
            boolean is_wht = Character.isWhitespace(ch[idx]);

            if ((!sub_str.containsValue(ch[idx]) && !is_wht)
                ||
                (!has_wht_sp) && (is_wht))
            {
                if (is_wht)
                {
                    has_wht_sp = true;
                }
                temp_longest ++;
                sub_str.put(ch[idx],ch[idx]);
                
                if (temp_longest > longest)
                {
                    longest = temp_longest;
                }
            }
            else
            {
                sub_str.clear();
                has_wht_sp = false;
                idx -= temp_longest;
                if (temp_longest > longest)
                {
                    longest = temp_longest;
                }
                temp_longest = 0;
                
            }
                        
            //System.out.println("longest is " + longest);

            idx ++;
        }
        
        return longest;
    }
}
