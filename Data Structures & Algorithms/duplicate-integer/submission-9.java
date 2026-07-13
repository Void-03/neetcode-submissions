class Solution 
{
    public boolean hasDuplicate(int[] nums) 
    {
        HashMap<Integer, Integer> seen_num = new HashMap<>();

        for(int i=0; i < nums.length; i++)
        {
            if(seen_num.containsKey(nums[i]))
            {
                return true;
            }
            seen_num.put(nums[i],i);
        }     
        return false;   
    }
}