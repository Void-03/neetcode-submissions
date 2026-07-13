class Solution 
{
    public boolean hasDuplicate(int[] nums) 
    {
        HashSet<Integer> seen_num = new HashSet<>();

        for(int i=0; i < nums.length; i++)
        {
            if(!seen_num.add(nums[i]))
            {
                return true;
            }
        }     
        return false;   
    }
}