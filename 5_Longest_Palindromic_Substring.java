class Solution {
    
    public boolean isPalindrome(String s, int length){
        boolean isPal=true;
        char [] ch_1 = s.toCharArray();
        int total_length = length;                

        int counter = 0;
        if (total_length == 0 || total_length == 1)
        {
            return true;
        }
        
        if ((total_length%2) == 1)//odd
        {
            for (counter = 0; counter < (total_length+1)/2; counter++)
            {                
                //System.out.println(s + " odd total_length " + total_length+ " counter " + counter);
                if(ch_1[counter] != ch_1[total_length-1-counter])
                {
                    isPal = false;
                    break;
                }
            }
        }
        else//even
        {
            for (counter = 0; counter < (total_length)/2; counter++)
            {
                //System.out.println(s + " even total_length " + total_length+ " counter " + counter);
                if(ch_1[counter] != ch_1[total_length-1-counter])
                {
                    isPal = false;
                    break;
                }
            }
        }
        return isPal;
    }
    
    public String longestPalindrome(String s) {
        char [] ch = s.toCharArray();
        int subStrLengthMinus1 = 0;
        int longest = 0;
        int temp_length = 0;
        String longest_palindromic = "";
        int start_ch_idx = 0;
        for (start_ch_idx = 0; start_ch_idx < s.length(); start_ch_idx++)
            //assuming longest palindromic start with a given start_ch_idx
        {
            if (longest >= s.length()-start_ch_idx)
            {
                break;
            }
            else
            {
                char [] subCh = new char[1000];
                
                for(subStrLengthMinus1 = 0; subStrLengthMinus1 < (s.length()-start_ch_idx); subStrLengthMinus1++)
                //construct new string
                {
                    //System.out.println("start_ch_idx " + start_ch_idx+ " subStrLengthMinus1 " + subStrLengthMinus1);

                    subCh[subStrLengthMinus1] = ch[start_ch_idx+subStrLengthMinus1];
                    String subStr = new String(subCh);
                    if (isPalindrome(subStr, subStrLengthMinus1+1))
                    {
                        if ((subStrLengthMinus1+1) > longest)
                        {
                            longest = (subStrLengthMinus1+1);
                            longest_palindromic = subStr;
                        }
                    }
  
                }//end construct new string

            }//end             if (longest >= s.length()-start_ch_idx)
            
        }
        
        char [] longest_palindromicStr = longest_palindromic.toCharArray();
        char [] answerCh = new char[longest];
        for (int counter = 0; counter < longest; counter++)
        {
            answerCh[counter] = longest_palindromicStr[counter];
        }
        
        String answerStr = new String(answerCh);
        return answerStr;
    }
}
