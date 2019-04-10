class Solution {
    public String intToRoman(int num) {
        StringBuilder s = new StringBuilder();
        
        if (num/1000 > 0)
        {
            for (int counterM = 0; counterM < num/1000; counterM++)
            {
                s.append('M');
            }
        }

        num %= 1000;
        
        if(num/100 == 9)
        {
            s.append("CM");
        }
        else if(5<=num/100 && num/100<=8)
        {
            s.append('D');
            num -= 500;
            for (int counterC = 0; counterC < num/100; counterC++)
            {
                s.append('C');
            }
        }
        else if(num/100 == 4)
        {
            s.append("CD");
        }
        else if(1<=num/100 && num/100<=3)
        {
            for (int counterC = 0; counterC < num/100; counterC++)
            {
                s.append('C');
            }
        }
        
        num %=100;
        
        if(num/10 == 9)
        {
            s.append("XC");
        }
        else if(5<=num/10 && num/10<=8)
        {
            s.append('L');
            num -= 50;
            for (int counterX = 0; counterX < num/10; counterX++)
            {
                s.append('X');
            }
        }
        else if(num/10 == 4)
        {
            s.append("XL");
        }
        else if(1<=num/10 && num/10<=3)
        {
            for (int counterX = 0; counterX < num/10; counterX++)
            {
                s.append('X');
            }
        }
        
        num %= 10;
        
        if(num == 9)
        {
            s.append("IX");
        }
        else if(5<=num && num<=8)
        {
            s.append('V');
            num -= 5;
            for (int counterX = 0; counterX < num; counterX++)
            {
                s.append('I');
            }
        }
        else if(num == 4)
        {
            s.append("IV");
        }
        else if(1<=num && num<=3)
        {
            for (int counterX = 0; counterX < num; counterX++)
            {
                s.append('I');
            }
        }
        
        String answer = s.toString();
        return answer;
    }
}
