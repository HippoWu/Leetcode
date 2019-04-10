class Solution {
    public int romanToInt(String s) {
        int index = 0;
        int answer = 0;
        while(index < s.length())
        {
            switch (s.charAt(index))
            {
                case 'M':
                    index++;
                    answer+=1000;
                    break;
                case 'D':
                    index++;
                    answer+=500;
                    break;
                case 'C':
                    index++;
                    if (index<s.length() && s.charAt(index) == 'M')
                    {
                        index++;
                        answer+=900;
                    }
                    else if(index<s.length() && s.charAt(index) == 'D')
                    {
                        index++;
                        answer+=400;
                    }
                    else
                    {
                        answer+=100;
                    }
                    break;
                case 'L':
                    index++;
                    answer+=50;
                    break;
                case 'X':
                    index++;
                    if (index<s.length() && s.charAt(index) == 'C')
                    {
                        index++;
                        answer+=90;
                    }
                    else if(index<s.length() && s.charAt(index) == 'L')
                    {
                        index++;
                        answer+=40;
                    }
                    else
                    {
                        answer+=10;
                    }
                    break;
                case 'V':
                    index++;
                    answer+=5;
                    break;
                case 'I':
                    index++;
                    if (index<s.length() && s.charAt(index) == 'X')
                    {
                        index++;
                        answer+=9;
                    }
                    else if(index<s.length() && s.charAt(index) == 'V')
                    {
                        index++;
                        answer+=4;
                    }
                    else
                    {
                        answer+=1;
                    }
                    break;
                default:
                    break;
            }
        }
        
        return answer;
    }
}
