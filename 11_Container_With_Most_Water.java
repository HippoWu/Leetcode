/**   O(n^2)
class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        
        for (int start = 0; start < height.length-1; start++)
        {
            for (int end = start+1; end < height.length; end ++)
            {
                int Area = Math.min(height[start], height[end]) * (end - start);
                if (Area > maxArea)
                    maxArea = Area;
            }
        }
        
        
        return maxArea;
        
    }
}

Runtime: 204 ms, faster than 23.43% of Java online submissions for Container With Most Water.
Memory Usage: 41.2 MB, less than 5.05% of Java online submissions for Container With Most Water.
*/


/*two pointer solution*/
class Solution {
    public int maxArea(int[] height){
        int maxArea = 0;
        
        int start = 0;
        int end = height.length-1;
        while(start<end)
        {
            int Area = Math.min(height[start], height[end]) * (end - start);
            if (Area > maxArea)
                maxArea = Area;
            
            if(height[start]<=height[end])
                start++;
            else
                end --;
        }
        return maxArea;
    }
}
