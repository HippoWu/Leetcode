class Solution {
    public int myAtoi(String str) {
        
        int ansInt = 0;
        long longAnsInt = 0;
        int idxCnt = 0;
        boolean negativeVal = false;
        boolean signBit = false;
        boolean numberStart = false;
        
        while(idxCnt < str.length())
        {
            if  (str.charAt(idxCnt) == ' ' && !signBit)
            {
                //continue
            }
            else if (!signBit && str.charAt(idxCnt) == '+')
            {
                signBit = true;
            }
            else if (!signBit && str.charAt(idxCnt) == '-')
            {
                negativeVal = true;     
                signBit = true;
            }
            else if(signBit && str.charAt(idxCnt) == ' ')
            {
                break;                
            }
            else if (0<=Character.getNumericValue(str.charAt(idxCnt))
                     && Character.getNumericValue(str.charAt(idxCnt))<=9)
            {
                numberStart = true;
            }
            else//non leading number
            {
                break;
            }
            
            //System.out.println("1. char: " + str.charAt(idxCnt) + " idxCnt: " + idxCnt + " negativeVal: " + negativeVal);

            if(numberStart)
            {
                while (idxCnt < str.length() 
                       && 
                       (0<=Character.getNumericValue(str.charAt(idxCnt)) && Character.getNumericValue(str.charAt(idxCnt))<=9))
                {
                    System.out.println("2. char: " + str.charAt(idxCnt) + " idxCnt: " + idxCnt);
                    longAnsInt*=10;
                    longAnsInt+= Character.getNumericValue(str.charAt(idxCnt));
                                            
                    //System.out.println("longAnsInt: " + longAnsInt);
                    if ((negativeVal && longAnsInt > Math.pow(2,31))
                        ||(!negativeVal) && (longAnsInt > Math.pow(2,31)-1))
                    {
                        break;
                    }

                    idxCnt++;

                }
                
                if (negativeVal)
                {
                    if (longAnsInt > Math.pow(2,31))
                        return (int)-Math.pow(2,31);
                    else
                        return -(int)longAnsInt;
                }
                else
                {
                    if (longAnsInt > Math.pow(2,31)-1)
                        return (int)(Math.pow(2,31)-1);
                    else
                        return (int)longAnsInt;
                }
                
            }
            


            
            idxCnt++;
        }
        
        
        return 0;
       
        
    }
}
