class Solution {
    public boolean isPalindrome(int x) {
        
        if (x<0)
        {
            return false;
        }
        
        String s = Integer.toString(x);
        //center is x/2 when length is odd
        //center is x/2-1 and x/2+1 when even
        
        int i = 0,j = 0;
        if (s.length()%2 == 1)
        {
            if (s.length() == 1)
            {
                return true;
            }
            i = (s.length()-1)/2-1;
            j = (s.length()+1)/2;
        }
        else 
        {
            i = s.length()/2-1;
            j = s.length()/2;
        }
        
        while(i >= 0 && j < s.length())
        {
            if (s.charAt(i) != s.charAt(j))
            {
                return false;
            }
            i--;
            j++;
        }
        return true;
        
    }
}
