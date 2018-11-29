/**
 * Note: The returned array must be malloced, assume caller calls free().
 */   

int result_idx[2];

int* twoSum(int* nums, int numsSize, int target) {
    int counter1;
    int counter2;
    bool found = false;        
    int break_flag = false;

    printf("numsSize=%d \n", numsSize);
    printf("%d, %d, \n",*(nums+47),*(nums+1433));    
    printf("%d, %d, \n",*(nums+379),*(nums+632));

    for (counter1 = 0; counter1 <= numsSize; counter1++)
    {
        for (counter2 = counter1+1; counter2 <= (numsSize); counter2++)
        {
            int* val1 = nums+counter1;
            int* val2 = nums+counter2;
            //printf("counter1=%d, counter2=%d, val1=%d val2=%d\n",counter1, counter2, *val1, *val2);
            //printf("val1+val2=%d break_flag=%d\n", (*val1 + *val2), break_flag);
            if((*val1 + *val2) == target)
            {
                break_flag = true;
                found = true;
                break;
            }
        }
        
        if (break_flag)
        {
            break;
        }
    }
    
    
    if (found)
    {    
        result_idx[0] = counter1;
        result_idx[1] = counter2;
    }
        
    return &result_idx[0];

}
